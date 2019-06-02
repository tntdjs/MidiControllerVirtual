package com.tntdjs.midi.controllers.akai.lpd8;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tntdjs.fxui.AbstractFXController;
import com.tntdjs.midi.controllers.MIDIDeviceHandler;
import com.tntdjs.midi.controllers.data.config.MidiDeviceXMLHelper;
import com.tntdjs.midi.controllers.data.config.objects.MidiButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;

/**
 * JavaFX Controller for an LPD8 midi controller device.
 * 
 * @author tsenausk
 *
 */
public class LPD8FXController extends AbstractFXController {
	private static final Logger LOGGER = LogManager.getLogger(LPD8FXController.class.getName());

	@FXML // value will be injected by the FXMLLoader
	private Button ButtonPad1;
	@FXML
	private Button ButtonPad2;
	@FXML
	private Button ButtonPad3;
	@FXML
	private Button ButtonPad4;
	@FXML
	private Button ButtonPad5;
	@FXML
	private Button ButtonPad6;
	@FXML
	private Button ButtonPad7;
	@FXML
	private Button ButtonPad8;

	@FXML
	private ComboBox<String> comboBox_pad1;
	@FXML
	private ComboBox<String> comboBox_pad2;
	@FXML
	private ComboBox<String> comboBox_pad3;
	@FXML
	private ComboBox<String> comboBox_pad4;
	@FXML
	private ComboBox<String> comboBox_pad5;
	@FXML
	private ComboBox<String> comboBox_pad6;
	@FXML
	private ComboBox<String> comboBox_pad7;
	@FXML
	private ComboBox<String> comboBox_pad8;

	@FXML
	private ImageView midiLogo;

	@Override
	protected List<MidiButton> getMidiButtonList(int bank) {
		return MidiDeviceXMLHelper.getInstance().getMidiButtonSet(bank);
	}

	@Override // This method is called by the FXMLLoader when initialization is
				// complete
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
		setMidiDeviceHandler(new MIDIDeviceHandler());

		assert ButtonPad1 == null : "fx:id=\"ButtonPad1\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad2 == null : "fx:id=\"ButtonPad2\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad3 == null : "fx:id=\"ButtonPad3\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad4 == null : "fx:id=\"ButtonPad4\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad5 == null : "fx:id=\"ButtonPad5\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad6 == null : "fx:id=\"ButtonPad6\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad7 == null : "fx:id=\"ButtonPad7\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad8 == null : "fx:id=\"ButtonPad8\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";

		assert comboBox_pad1 == null : "fx:id=\"comboBox_pad1\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert comboBox_pad2 == null : "fx:id=\"comboBox_pad2\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert comboBox_pad3 == null : "fx:id=\"comboBox_pad3\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert comboBox_pad4 == null : "fx:id=\"comboBox_pad4\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert comboBox_pad5 == null : "fx:id=\"comboBox_pad5\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert comboBox_pad6 == null : "fx:id=\"comboBox_pad6\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert comboBox_pad7 == null : "fx:id=\"comboBox_pad7\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert comboBox_pad8 == null : "fx:id=\"comboBox_pad8\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";

		// assert midiLogo == null : "fx:id=\"midiLogo\" was not injected: check
		// your FXML file 'MIDIFighterFXScene.fxml'.";

		// Image img = new Image("images/MIDI-red-icon.png");
		// midiLogo.setImage(img);

		if (null != comboBox_pad1) {
			comboBox_pad1.getItems().clear();
			comboBox_pad1.setValue("|----");
			comboBox_pad1.getItems().addAll("|----", "|---->", "|----|", " -- -- ");
		}
		if (null != comboBox_pad2) {
			comboBox_pad2.getItems().clear();
			comboBox_pad2.setValue("|----");
			comboBox_pad2.getItems().addAll("|----", "|---->", "|----|", " -- -- ");
		}
		if (null != comboBox_pad3) {
			comboBox_pad3.getItems().clear();
			comboBox_pad3.setValue("|----");
			comboBox_pad3.getItems().addAll("|----", "|---->", "|----|", " -- -- ");
		}
		if (null != comboBox_pad4) {
			comboBox_pad4.getItems().clear();
			comboBox_pad4.setValue("|----");
			comboBox_pad4.getItems().addAll("|----", "|---->", "|----|", " -- -- ");
		}
		if (null != comboBox_pad5) {
			comboBox_pad5.getItems().clear();
			comboBox_pad5.setValue("|----");
			comboBox_pad5.getItems().addAll("|----", "|---->", "|----|", " -- -- ");
		}
		if (null != comboBox_pad6) {
			comboBox_pad6.getItems().clear();
			comboBox_pad6.setValue("|----");
			comboBox_pad6.getItems().addAll("|----", "|---->", "|----|", " -- -- ");
		}
		if (null != comboBox_pad7) {
			comboBox_pad7.getItems().clear();
			comboBox_pad7.setValue("|----");
			comboBox_pad7.getItems().addAll("|----", "|---->", "|----|", " -- -- ");
		}
		if (null != comboBox_pad8) {
			comboBox_pad8.getItems().clear();
			comboBox_pad8.setValue("|----");
			comboBox_pad8.getItems().addAll("|----", "|---->", "|----|", " -- -- ");
		}
		// initialize your logic here: all @FXML variables will have been
		// injected
		if (null != ButtonPad1) {ButtonPad1.setDisable(true);}
		if (null != ButtonPad2) {ButtonPad2.setDisable(true);}
		if (null != ButtonPad3) {ButtonPad3.setDisable(true);}
		if (null != ButtonPad4) {ButtonPad4.setDisable(true);}
		if (null != ButtonPad5) {ButtonPad5.setDisable(true);}
		if (null != ButtonPad6) {ButtonPad6.setDisable(true);}
		if (null != ButtonPad7) {ButtonPad7.setDisable(true);}
		if (null != ButtonPad8) {ButtonPad8.setDisable(true);}

		try {
			enableValidButtons(getMidiButtonList(0));
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

	/**
	 * @param button
	 */
	@Override
	protected void enableButton(MidiButton button) {
		if (ButtonPad1.getId().equals(button.getId())) {
			ButtonPad1.setDisable(false);
		} else if (ButtonPad2.getId().equals(button.getId())) {
			ButtonPad2.setDisable(false);
		} else if (ButtonPad3.getId().equals(button.getId())) {
			ButtonPad3.setDisable(false);
		} else if (ButtonPad4.getId().equals(button.getId())) {
			ButtonPad4.setDisable(false);
		} else if (ButtonPad5.getId().equals(button.getId())) {
			ButtonPad5.setDisable(false);
		} else if (ButtonPad6.getId().equals(button.getId())) {
			ButtonPad6.setDisable(false);
		} else if (ButtonPad7.getId().equals(button.getId())) {
			ButtonPad7.setDisable(false);
		} else if (ButtonPad8.getId().equals(button.getId())) {
			ButtonPad8.setDisable(false);
		}
	}

	@FXML
	protected void handleButtonPad1Action(ActionEvent event) throws Exception {
		executer("button-pad1");
	}

	@FXML
	protected void handleButtonPad2Action(ActionEvent event) throws Exception {
		executer("button-pad2");
	}

	@FXML
	protected void handleButtonPad3Action(ActionEvent event) throws Exception {
		executer("button-pad3");
	}

	@FXML
	protected void handleButtonPad4Action(ActionEvent event) throws Exception {
		executer("button-pad4");
	}

	@FXML
	protected void handleButtonPad5Action(ActionEvent event) throws Exception {
		executer("button-pad5");
	}

	@FXML
	protected void handleButtonPad6Action(ActionEvent event) throws Exception {
		executer("button-pad6");
	}

	@FXML
	protected void handleButtonPad7Action(ActionEvent event) throws Exception {
		executer("button-pad7");
	}

	@FXML
	protected void handleButtonPad8Action(ActionEvent event) throws Exception {
		executer("button-pad8");
	}

}