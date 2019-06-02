package com.tntdjs.fxui;

import java.util.List;

import com.tntdjs.midi.IMidiExecuter;
import com.tntdjs.midi.controllers.IMidiDeviceHandler;
import com.tntdjs.midi.controllers.data.config.objects.MidiButton;
import com.tntdjs.midi.controllers.data.config.objects.validation.IValidation;
import com.tntdjs.midi.controllers.data.config.objects.validation.MidiButtonEnabledValidator;
import com.tntdjs.midi.executer.ExecuterFactory;

import javafx.fxml.Initializable;

/**
 * 
 * @author tsenauskas
 *
 */
public abstract class AbstractFXController implements Initializable, IFXMIDIController {
	private IMidiDeviceHandler midiDeviceHandler;
	private final IValidation validator = new MidiButtonEnabledValidator();

	public AbstractFXController() {
		super();
	}

	public IMidiDeviceHandler getMidiDeviceHandler() {
		return midiDeviceHandler;
	}

	public void setMidiDeviceHandler(IMidiDeviceHandler midiDeviceHandler) {
		this.midiDeviceHandler = midiDeviceHandler;
	}

	@Override
	public void configure() {
		getMidiDeviceHandler().configure();
	}

	@Override
	public void initController() {
		getMidiDeviceHandler().initMidi();
	}

	@Override
	public void deInitController() {
		getMidiDeviceHandler().deInitMidi();
	}
	
	/**
	 * getValidator
	 * @return an IValidator for performing validations
	 */
	public IValidation getValidator() {
		return validator;
	}
		
	/**
	 * enableValidButtons - enables/displays buttons based on how they are configured to be used 
	 * @param buttonList
	 */
	protected void enableValidButtons(List<MidiButton> buttonList) throws Exception {
		if (getMidiButtonList(0).isEmpty()) {
			throw new Exception("No midi button list was defined.");
		}
		for (MidiButton midiButton : buttonList) {
			if (midiButton.test()) {
				enableButton(midiButton);
			}
		}
	}
	
	/**
	 * executer
	 * @param value
	 */
	public void executer(String value) throws Exception {
		if (getMidiButtonList(0).isEmpty()) {
			throw new Exception("No midi button list was defined.");
		}
		for (MidiButton midiButton : getMidiButtonList(0)) {
			// @ TODO remove the validator and use the new MidiButton test() method
			// this is the last use of the validator in the code base to eliminate.
			if (midiButton.getId().equalsIgnoreCase(value) && getValidator().isValid(midiButton)) {
				((IMidiExecuter) ExecuterFactory.getInstance().getExecuterByMidiNote(midiButton.getMidiNote())).executer();
				break;
			}			
		}
	}
	
	protected abstract void enableButton(MidiButton button);	
	
	protected abstract List<MidiButton> getMidiButtonList(int buttonSet);
}