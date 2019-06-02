package com.tntdjs;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tntdjs.utils.SystemPropertyMgr;

public class CommonTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {		
		assertTrue(!SystemPropertyMgr.getInstance().getString("win.title").isEmpty());
		assertTrue(!SystemPropertyMgr.getInstance().getString("locale.language").isEmpty());
		assertTrue(!SystemPropertyMgr.getInstance().getString("locale.country").isEmpty());
	}

}
