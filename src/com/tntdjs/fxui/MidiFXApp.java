package com.tntdjs.fxui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tntdjs.midi.controllers.IMidiDeviceHandler;
import com.tntdjs.midi.controllers.MIDIDeviceHandler;
import com.tntdjs.midi.controllers.MidiControllerDefMgr;
import com.tntdjs.midi.controllers.data.config.MidiDeviceXMLHelper;
import com.tntdjs.midi.executer.ExecuterFactory;
import com.tntdjs.utils.SystemPropertyMgr;
import com.tntdjs.utils.fx.FXDialogs;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Midi FxApplication main class. 
 * Copyright (c) 2017, Todd M. Senauskas and/or its affiliates. All rights reserved.
 * 
 * @author tsenauskas
 */
public class MidiFXApp extends Application {
	private static MidiFXApp INSTANCE;
	private static final Logger LOGGER = LogManager.getLogger(MidiFXApp.class.getName());
	private ApplicationContext CONTEXT;
	private Scene SCENE;
	private IMidiDeviceHandler MidiDeviceHandler;
	private IFXMIDIController fxController;
	
	private final String TITLE = SystemPropertyMgr.getInstance().getString("win.title");

	public static MidiFXApp getInstance() {
		return INSTANCE;
	}

	@Override
	public void start(Stage STAGE) throws Exception {
		LOGGER.info("Application Starting...");

		try (AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml")) {
			setContext(appContext);
			MidiDeviceXMLHelper.getInstance(CONTEXT);
			
			/**
			 * @to do refactor this to use a device factory
			 * @to do made this spring injected for now, looks okay but maybe a device factory would help
			 * LPD8XMLHelper.getInstance().getDevice().getMidiDevice()
			 */			
			MidiDeviceHandler = new MIDIDeviceHandler();
			MidiDeviceHandler.setDeviceName(MidiDeviceXMLHelper.getInstance().getDevice().getName());
			MidiDeviceHandler.initMidi();
			LOGGER.info("Device: " + MidiDeviceHandler.getDeviceName());
			
			MidiControllerDefMgr midiDefMgr = (MidiControllerDefMgr) getContext().getBean("midiControllerDefMgr");
			String currentControllerName = midiDefMgr.getMidiControllerDef().getMidiControllerName();
			String currentControllerPath = midiDefMgr.getMidiControllerDef().getMidiControllerPath();
			
			URL currentControllerURL = MidiFXApp.class.getClassLoader()
					.getResource(currentControllerPath + currentControllerName + ".fxml");
			LOGGER.info("Current FXML Details:");
			LOGGER.info("Current FXML Path: " + currentControllerPath);
			LOGGER.info("Current FXML Name: " + currentControllerName);
			LOGGER.info("Current FXML URL: " + currentControllerURL.toString());
			
			Locale locale = new Locale(SystemPropertyMgr.getInstance().getString("locale.language"),
					SystemPropertyMgr.getInstance().getString("locale.country"));
			ResourceBundle currentControllerBundle = ResourceBundle
					.getBundle(currentControllerPath + currentControllerName, locale);

			MenuBar menuBar = createMenuBar();
			BorderPane root = new BorderPane();
			root.setTop(menuBar);
			
			FXMLLoader loader = new FXMLLoader(currentControllerURL, currentControllerBundle);
			Parent rootController = loader.load();
			root.setCenter(rootController);						
			setFxController((IFXMIDIController)loader.getController());
		
			ExecuterFactory.getInstance().generateExecuters(MidiDeviceXMLHelper.getInstance().getMidiButtonSet(0));
			
			STAGE.getIcons().add(new Image("images/MIDI-red-icon.png"));
			STAGE.setTitle(TITLE);
			STAGE.setHeight(new Double(midiDefMgr.getMidiControllerDef().getAppHeight()));
			STAGE.setWidth(new Double(midiDefMgr.getMidiControllerDef().getAppWidth()));
			
			SCENE = new Scene(root);
			STAGE.setScene(SCENE);
			STAGE.setOnCloseRequest(event -> {
			    CloseApplication();
			});
			
			STAGE.show();
			INSTANCE = this;
		} catch (Exception ex) {
			LOGGER.fatal("Error in main()", ex);
			LOGGER.error("Possibly because a valid Current Controller file (Spring) is required.");
			throw new RuntimeException("Failed to start: Error in main()", ex);
		}
		
	}

	/**
	 * @return
	 */
	private MenuBar createMenuBar() {
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("File");

		Menu menuDevice = new Menu("Device");

		MenuItem miConfig = new MenuItem("Configure");
		miConfig.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				getFxController().configure();
			}
		});
		menuDevice.getItems().addAll(miConfig);

		// add dividerbar here

		MenuItem miInit = new MenuItem("Initialize");
		miInit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				// getFxController().initController();
				// getMidiDevice().initMidi();
			}
		});
		menuDevice.getItems().addAll(miInit);

		MenuItem miDeInit = new MenuItem("De-Initialize");
		miDeInit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				// getFxController().deInitController();
			}
		});
		menuDevice.getItems().addAll(miDeInit);

		MenuItem miExit = new MenuItem("Exit");
		miExit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				CloseApplication();
			}
		});
		menuFile.getItems().addAll(miExit);

		Menu menuHelp = new Menu("Help");
		
		MenuItem miAbout = new MenuItem("About");
		miAbout.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				FXDialogs.showInformation("About " + TITLE, "Virtual Midi Controller\nVersion 1.0\nCopyright (c) 2017, Todd M. Senauskas and/or its affiliates.\nAll rights reserved.");
			}
		});
		menuHelp.getItems().addAll(miAbout);
		
		menuBar.getMenus().addAll(menuFile, menuDevice, menuHelp);
		return menuBar;
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void restart() {
		try {
			start(new Stage());
		} catch (Exception ex) {
			LOGGER.fatal(null, ex);
			throw new RuntimeException("Failed to start another Modena window", ex);
		}
	}

	/**
	 * @todo make this JOptionPane FX style rather than Swing if needed
	 * @todo this should not be public but the scenes reference this from
	 *       subpackages elsewhere
	 */
	public void CloseApplication() {
		if (FXDialogs.showConfirm(TITLE, "Exit, are you sure?", FXDialogs.YES, FXDialogs.NO).equals(FXDialogs.YES)) {
			if (null != MidiDeviceHandler && MidiDeviceHandler.isInitialized()) {
				MidiDeviceHandler.deInitMidi();
			}
			LOGGER.info("Application Exited Safely");
			System.exit(0);
		}
	}

	public IMidiDeviceHandler getMidiDevice() {
		return MidiDeviceHandler;
	}

	public void setMidiDevice(IMidiDeviceHandler midiDevice) {
		this.MidiDeviceHandler = midiDevice;
	}

	public IFXMIDIController getFxController() {
		return fxController;
	}

	public void setFxController(IFXMIDIController fxController) {
		this.fxController = fxController;
	}

	public Scene getScene() {
		return SCENE;
	}

	public ApplicationContext getContext() {
		return CONTEXT;
	}
	
	private void setContext(AbstractApplicationContext argContext) {
		CONTEXT = argContext;
	}
}