package com.tntdjs.fxui;

/**
 * This is an JavaFX controller for a midi device controller
 * @author tsenauskas
 *
 */
public interface IFXMIDIController {

	public void configure();
	public void initController();
	public void deInitController();
	public void executer(String value) throws Exception;
}