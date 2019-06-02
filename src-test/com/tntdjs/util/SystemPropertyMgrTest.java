package com.tntdjs.util;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Locale;

import org.junit.Test;

import com.tntdjs.utils.SystemPropertyMgr;

/**
 * 
 * @author tsenausk
 *
 */
public class SystemPropertyMgrTest {

	@Test
	public void validateLocale() {
		System.out.println("SystemPropertyMgrTest::Validate Locale (Country)");
		assertEquals(SystemPropertyMgr.getInstance().getString("locale.country"), "US");
		assertTrue(Arrays.asList(Locale.getISOCountries()).contains(SystemPropertyMgr.getInstance().getString("locale.country")));

		System.out.println("SystemPropertyMgrTest::Validate Locale (Language)");
		assertEquals(SystemPropertyMgr.getInstance().getString("locale.language"), "en");		
		assertTrue(Arrays.asList(Locale.getISOLanguages()).contains(SystemPropertyMgr.getInstance().getString("locale.language")));
	}

	@Test
	public void validateMidiControllerDefinition() {
		System.out.println("SystemPropertyMgrTest::Validate Midi Controller Definitions (path/name)");
		assertNotEquals(SystemPropertyMgr.getInstance().getString("midi.controller.path"), "");
		assertNotEquals(SystemPropertyMgr.getInstance().getString("midi.controller.name"), "");
	}

	@Test
	public void validateWinTitle() {		
		System.out.println("SystemPropertyMgrTest::Validate Window Title");
		assertNotEquals(SystemPropertyMgr.getInstance().getString("win.title"), "");
	}
	
}
