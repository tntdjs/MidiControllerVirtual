package com.tntdjs.midi.controllers.adafruit.circuitplayground;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tntdjs.fxui.AbstractFXController;
import com.tntdjs.midi.controllers.MIDIDeviceHandler;
import com.tntdjs.midi.controllers.data.config.MidiDeviceXMLHelper;
import com.tntdjs.midi.controllers.data.config.objects.MidiButton;
import com.tntdjs.midi.controllers.djtt.midifighter.MFButton;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.util.Duration;

/**
 * 
 * @author tsenausk
 *
 */
public class CircuitPlaygroundFXController extends AbstractFXController {
	private static final Logger LOGGER = LogManager.getLogger(CircuitPlaygroundFXController.class.getName());
	
	@FXML // value will be injected by the FXMLLoader
	private MFButton ctButton0;
	@FXML
	private MFButton ctButton1;
	@FXML
	private MFButton ctButton2;
	@FXML
	private MFButton ctButton3;
	@FXML
	private MFButton ctButton4;
	@FXML
	private MFButton ctButton6;
	@FXML
	private MFButton ctButton9;
	@FXML
	private MFButton ctButton10;
	@FXML
	private MFButton ctButton12;
	@FXML
	private MFButton ctButton19;
	@FXML
	private ToggleButton slideSwitch21;
	@FXML
	private MFButton neopixel0;
	@FXML
	private MFButton neopixel1;
	@FXML
	private MFButton neopixel2;
	@FXML
	private MFButton neopixel3;
	@FXML
	private MFButton neopixel4;
	@FXML
	private MFButton neopixel5;	
	@FXML
	private MFButton neopixel6;
	@FXML
	private MFButton neopixel7;
	@FXML
	private MFButton neopixel8;	
	@FXML
	private MFButton neopixel9;
	
	@Override
	protected List<MidiButton> getMidiButtonList(int bank) {
		return MidiDeviceXMLHelper.getInstance().getMidiButtonSet(bank);
	}

	@Override // This method is called by the FXMLLoader when initialization is
				// complete
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
		setMidiDeviceHandler(new MIDIDeviceHandler());

		assert ctButton0 == null : "fx:id=\"ButtonPad1\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert ctButton1 == null : "fx:id=\"ButtonPad1\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert ctButton2 == null : "fx:id=\"ButtonPad2\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert ctButton3 == null : "fx:id=\"ButtonPad3\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert ctButton4 == null : "fx:id=\"ButtonPad4\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert ctButton6 == null : "fx:id=\"ButtonPad5\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert ctButton9 == null : "fx:id=\"ButtonPad6\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert ctButton10 == null : "fx:id=\"ButtonPad7\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert ctButton12 == null : "fx:id=\"ButtonPad8\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert ctButton19 == null : "fx:id=\"ButtonPad9\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert slideSwitch21 == null : "fx:id=\"ButtonPad10\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert neopixel0 == null : "fx:id=\"neopixel0\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert neopixel1 == null : "fx:id=\"neopixel1\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert neopixel2 == null : "fx:id=\"neopixel2\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert neopixel3 == null : "fx:id=\"neopixel3\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert neopixel4 == null : "fx:id=\"neopixel4\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert neopixel5 == null : "fx:id=\"neopixel5\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert neopixel6 == null : "fx:id=\"neopixel6\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert neopixel7 == null : "fx:id=\"neopixel7\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert neopixel8 == null : "fx:id=\"neopixel8\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		assert neopixel9 == null : "fx:id=\"neopixel9\" was not injected: check your FXML file 'CircuitPlaygroundFXScene.fxml'.";
		
		// initialize your logic here: all @FXML variables will have been
		// injected
		if (null != ctButton0) {
			ctButton0.setDisable(true);
		}
		if (null != ctButton1) {
			ctButton1.setDisable(true);
		}
		if (null != ctButton2) {
			ctButton3.setDisable(true);
		}
		if (null != ctButton3) {
			ctButton3.setDisable(true);
		}
		if (null != ctButton4) {
			ctButton4.setDisable(true);
		}
		if (null != ctButton6) {
			ctButton6.setDisable(true);
		}
		if (null != ctButton9) {
			ctButton9.setDisable(true);
		}
		if (null != ctButton10) {
			ctButton10.setDisable(true);
		}
		if (null != ctButton12) {
			ctButton12.setDisable(true);
		}
		if (null != ctButton19) {
			ctButton19.setDisable(true);
		}
		if (null != slideSwitch21) {
			slideSwitch21.setDisable(true);
		}
		if (null != neopixel0) {
			neopixel0.setDisable(true);
		}
		if (null != neopixel1) {
			neopixel1.setDisable(true);
		}
		if (null != neopixel2) {
			neopixel2.setDisable(true);
		}
		if (null != neopixel3) {
			neopixel3.setDisable(true);
		}
		if (null != neopixel4) {
			neopixel4.setDisable(true);
		}
		if (null != neopixel5) {
			neopixel5.setDisable(true);
		}
		if (null != neopixel6) {
			neopixel6.setDisable(true);
		}
		if (null != neopixel7) {
			neopixel7.setDisable(true);
		}
		if (null != neopixel8) {
			neopixel8.setDisable(true);
		}
		if (null != neopixel9) {
			neopixel9.setDisable(true);
		}
		
		try {
			enableValidButtons(getMidiButtonList(0));
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

	@Override
	protected void enableButton(MidiButton button) {
		if (ctButton0.getId().equals(button.getId())) {
			ctButton0.setDisable(false);
		} else if (ctButton1.getId().equals(button.getId())) {
			ctButton1.setDisable(false);
		} else if (ctButton2.getId().equals(button.getId())) {
			ctButton2.setDisable(false);
		} else if (ctButton3.getId().equals(button.getId())) {
			ctButton3.setDisable(false);
		} else if (ctButton4.getId().equals(button.getId())) {
			ctButton4.setDisable(false);
		} else if (ctButton6.getId().equals(button.getId())) {
			ctButton6.setDisable(false);
		} else if (ctButton9.getId().equals(button.getId())) {
			ctButton9.setDisable(false);
		} else if (ctButton10.getId().equals(button.getId())) {
			ctButton10.setDisable(false);
		} else if (ctButton12.getId().equals(button.getId())) {
			ctButton12.setDisable(false);
		} else if (ctButton19.getId().equals(button.getId())) {
			ctButton19.setDisable(false);
		} else if (slideSwitch21.getId().equals(button.getId())) {
			slideSwitch21.setDisable(false);
		} else if (neopixel0.getId().equals(button.getId())) {
			neopixel0.setDisable(false);
		} else if (neopixel1.getId().equals(button.getId())) {
			neopixel1.setDisable(false);
		} else if (neopixel2.getId().equals(button.getId())) {
			neopixel2.setDisable(false);
		} else if (neopixel3.getId().equals(button.getId())) {
			neopixel3.setDisable(false);
		} else if (neopixel4.getId().equals(button.getId())) {
			neopixel4.setDisable(false);
		} else if (neopixel5.getId().equals(button.getId())) {
			neopixel5.setDisable(false);
		} else if (neopixel6.getId().equals(button.getId())) {
			neopixel6.setDisable(false);
		} else if (neopixel7.getId().equals(button.getId())) {
			neopixel7.setDisable(false);
		} else if (neopixel8.getId().equals(button.getId())) {
			neopixel8.setDisable(false);
		} else if (neopixel9.getId().equals(button.getId())) {
			neopixel9.setDisable(false);			
		}
	}

	/**
	 * Flash the requested button and play the associated audio executer(String
	 * value) String value is the button pressed; it will be flashed and the
	 * associated audio will be played
	 * @throws Exception 
	 */
	public void executer(String value) throws Exception {
		super.executer(value);

		MFButton flashButton=null;
		switch (value) {
		case "ct-button-0":
			flashButton = ctButton0;
			break;
		case "ct-button-1":
			flashButton = ctButton1;
			break;
		case "ct-button-2":
			flashButton = ctButton2;
			break;
		case "ct-button-3":
			flashButton = ctButton3;
			break;
		case "ct-button-4":
			flashButton = ctButton4;
			break;
		case "ct-button-6":
			flashButton = ctButton6;
			break;
		case "ct-button-9":
			flashButton = ctButton9;
			break;
		case "ct-button-10":
			flashButton = ctButton10;
			break;
		case "ct-button-12":
			flashButton = ctButton12;
			break;
		case "ct-button-19":
			flashButton = ctButton19;
			break;
		case "slide-switch-21":
//			flashButton = slideSwitch21;
			break;
		case "neopixel-0":
			flashButton = neopixel0;
			break;
		case "neopixel-1":
			flashButton = neopixel1;
			break;
		case "neopixel-2":
			flashButton = neopixel2;
			break;
		case "neopixel-3":
			flashButton = neopixel3;
			break;
		case "neopixel-4":
			flashButton = neopixel4;
			break;
		case "neopixel-5":
			flashButton = neopixel5;
			break;
		case "neopixel-6":
			flashButton = neopixel6;
			break;
		case "neopixel-7":
			flashButton = neopixel7;
			break;
		case "neopixel-8":
			flashButton = neopixel8;
			break;
		case "neopixel-9":
			flashButton = neopixel9;
			break;
			
		default:
			throw new IllegalArgumentException("Invalid Button Value for Executer: " + value);
		}

		FadeTransition ft = new FadeTransition(Duration.millis(150), flashButton);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(2);
		ft.setAutoReverse(true);
		ft.play();

	}

	@FXML
	protected void handleCTButton0Action(ActionEvent event) throws Exception {
		// test send
		// MidiDeviceHandler.getTransmitter().setReceiver((Receiver)MidiDeviceHandler.getReceiver());
		// ShortMessage myMsg = new ShortMessage();
		// try {
		// myMsg.setMessage(ShortMessage.NOTE_OFF, 1, 48, 1);
		// } catch (InvalidMidiDataException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// ((Receiver)MidiDeviceHandler.getReceiver()).send(myMsg, -1);
		// end send

		executer("ct-button-0");
	}

	@FXML
	protected void handleCTButton1Action(ActionEvent event) throws Exception {
		executer("ct-button-1");
	}

	@FXML
	protected void handleCTButton2Action(ActionEvent event) throws Exception {
		executer("ct-button-2");
	}

	@FXML
	protected void handleCTButton3Action(ActionEvent event) throws Exception {
		executer("ct-button-3");
	}

	@FXML
	protected void handleCTButton4Action(ActionEvent event) throws Exception {
		//Special Circuit Playground button <left>
		executer("ct-button-4");
	}

	@FXML
	protected void handleCTButton6Action(ActionEvent event) throws Exception {
		executer("ct-button-6");
	}

	@FXML
	protected void handleCTButton9Action(ActionEvent event) throws Exception {
		executer("ct-button-9");
	}

	@FXML
	protected void handleCTButton10Action(ActionEvent event) throws Exception {
		executer("ct-button-10");
	}

	@FXML
	protected void handleCTButton12Action(ActionEvent event) throws Exception {
		executer("ct-button-12");
	}

	@FXML
	protected void handleCTButton19Action(ActionEvent event) throws Exception {
		//Special Circuit Playground button <right>
		executer("ct-button-19");
	}

	@FXML
	protected void handleSlideSwitch21Action(ActionEvent event) throws Exception {
		//Special Circuit Playground slide switch (JavaFX Toggle Button) <slide switch left/right>
		executer("slide-switch-21");
	}

}