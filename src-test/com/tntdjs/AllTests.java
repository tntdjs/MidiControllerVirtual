package com.tntdjs;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.tntdjs.midi.controllers.MidiControllerDefMgrTest;
import com.tntdjs.midi.controllers.data.config.MidiDeviceXMLHelperTest;
import com.tntdjs.util.UtilTestSuite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	CommonTest.class,
	UtilTestSuite.class,
	MidiControllerDefMgrTest.class,
	MidiDeviceXMLHelperTest.class
})

public class AllTests {   

	
}
