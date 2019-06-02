package com.tntdjs.midi.controllers.djtt.midifighter;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tntdjs.fxui.AbstractFXController;
import com.tntdjs.midi.controllers.MIDIDeviceHandler;
import com.tntdjs.midi.controllers.data.config.MidiDeviceXMLHelper;
import com.tntdjs.midi.controllers.data.config.objects.MidiButton;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * 
 * @author tsenausk
 *
 */
public class MIDIFighterFXController extends AbstractFXController {
	private static final Logger LOGGER = LogManager.getLogger(MIDIFighterFXController.class.getName());
	
	@FXML // value will be injected by the FXMLLoader
	private MFButton ButtonPad1;
	@FXML
	private MFButton ButtonPad2;
	@FXML
	private MFButton ButtonPad3;
	@FXML
	private MFButton ButtonPad4;
	@FXML
	private MFButton ButtonPad5;
	@FXML
	private MFButton ButtonPad6;
	@FXML
	private MFButton ButtonPad7;
	@FXML
	private MFButton ButtonPad8;
	@FXML
	private MFButton ButtonPad9;
	@FXML
	private MFButton ButtonPad10;
	@FXML
	private MFButton ButtonPad11;
	@FXML
	private MFButton ButtonPad12;
	@FXML
	private MFButton ButtonPad13;
	@FXML
	private MFButton ButtonPad14;
	@FXML
	private MFButton ButtonPad15;
	@FXML
	private MFButton ButtonPad16;

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
		assert ButtonPad9 == null : "fx:id=\"ButtonPad9\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad10 == null : "fx:id=\"ButtonPad10\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad11 == null : "fx:id=\"ButtonPad11\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad12 == null : "fx:id=\"ButtonPad12\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad13 == null : "fx:id=\"ButtonPad13\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad14 == null : "fx:id=\"ButtonPad14\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad15 == null : "fx:id=\"ButtonPad15\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";
		assert ButtonPad16 == null : "fx:id=\"ButtonPad16\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";

		assert midiLogo == null : "fx:id=\"midiLogo\" was not injected: check your FXML file 'MIDIFighterFXScene.fxml'.";

		if (null != midiLogo) {
			midiLogo.setImage(new Image("images/djtt/midifighter/Midi_Fighter_Gradient_Logo_BLK.jpg"));
		}

		// initialize your logic here: all @FXML variables will have been
		// injected
		if (null != ButtonPad1) {
			ButtonPad1.setDisable(true);
		}
		if (null != ButtonPad2) {
			ButtonPad2.setDisable(true);
		}
		if (null != ButtonPad3) {
			ButtonPad3.setDisable(true);
		}
		if (null != ButtonPad4) {
			ButtonPad4.setDisable(true);
		}
		if (null != ButtonPad5) {
			ButtonPad5.setDisable(true);
		}
		if (null != ButtonPad6) {
			ButtonPad6.setDisable(true);
		}
		if (null != ButtonPad7) {
			ButtonPad7.setDisable(true);
		}
		if (null != ButtonPad8) {
			ButtonPad8.setDisable(true);
		}
		if (null != ButtonPad9) {
			ButtonPad9.setDisable(true);
		}
		if (null != ButtonPad10) {
			ButtonPad10.setDisable(true);
		}
		if (null != ButtonPad11) {
			ButtonPad11.setDisable(true);
		}
		if (null != ButtonPad12) {
			ButtonPad12.setDisable(true);
		}
		if (null != ButtonPad13) {
			ButtonPad13.setDisable(true);
		}
		if (null != ButtonPad14) {
			ButtonPad14.setDisable(true);
		}
		if (null != ButtonPad15) {
			ButtonPad15.setDisable(true);
		}
		if (null != ButtonPad16) {
			ButtonPad16.setDisable(true);
		}

		try {
			enableValidButtons(getMidiButtonList(0));
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

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
		} else if (ButtonPad9.getId().equals(button.getId())) {
			ButtonPad9.setDisable(false);
		} else if (ButtonPad10.getId().equals(button.getId())) {
			ButtonPad10.setDisable(false);
		} else if (ButtonPad11.getId().equals(button.getId())) {
			ButtonPad11.setDisable(false);
		} else if (ButtonPad12.getId().equals(button.getId())) {
			ButtonPad12.setDisable(false);
		} else if (ButtonPad13.getId().equals(button.getId())) {
			ButtonPad13.setDisable(false);
		} else if (ButtonPad14.getId().equals(button.getId())) {
			ButtonPad14.setDisable(false);
		} else if (ButtonPad15.getId().equals(button.getId())) {
			ButtonPad15.setDisable(false);
		} else if (ButtonPad16.getId().equals(button.getId())) {
			ButtonPad16.setDisable(false);
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

		MFButton flashButton;
		switch (value) {
		case "button-pad1":
			flashButton = ButtonPad1;
			break;
		case "button-pad2":
			flashButton = ButtonPad2;
			break;
		case "button-pad3":
			flashButton = ButtonPad3;
			break;
		case "button-pad4":
			flashButton = ButtonPad4;
			break;
		case "button-pad5":
			flashButton = ButtonPad5;
			break;
		case "button-pad6":
			flashButton = ButtonPad6;
			break;
		case "button-pad7":
			flashButton = ButtonPad7;
			break;
		case "button-pad8":
			flashButton = ButtonPad8;
			break;
		case "button-pad9":
			flashButton = ButtonPad9;
			break;
		case "button-pad10":
			flashButton = ButtonPad10;
			break;
		case "button-pad11":
			flashButton = ButtonPad11;
			break;
		case "button-pad12":
			flashButton = ButtonPad12;
			break;
		case "button-pad13":
			flashButton = ButtonPad13;
			break;
		case "button-pad14":
			flashButton = ButtonPad14;
			break;
		case "button-pad15":
			flashButton = ButtonPad15;
			break;
		case "button-pad16":
			flashButton = ButtonPad16;
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
	protected void handleButtonPad1Action(ActionEvent event) throws Exception {
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

	@FXML
	protected void handleButtonPad9Action(ActionEvent event) throws Exception {
		executer("button-pad9");
	}

	@FXML
	protected void handleButtonPad10Action(ActionEvent event) throws Exception {
		executer("button-pad10");
	}

	@FXML
	protected void handleButtonPad11Action(ActionEvent event) throws Exception {
		executer("button-pad11");
	}

	@FXML
	protected void handleButtonPad12Action(ActionEvent event) throws Exception {
		executer("button-pad12");
	}

	@FXML
	protected void handleButtonPad13Action(ActionEvent event) throws Exception {
		executer("button-pad13");
	}

	@FXML
	protected void handleButtonPad14Action(ActionEvent event) throws Exception {
		executer("button-pad14");
	}

	@FXML
	protected void handleButtonPad15Action(ActionEvent event) throws Exception {
		executer("button-pad15");
	}

	@FXML
	protected void handleButtonPad16Action(ActionEvent event) throws Exception {
		executer("button-pad16");
	}

}