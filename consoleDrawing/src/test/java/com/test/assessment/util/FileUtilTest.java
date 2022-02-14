/**
 * 
 */
package com.test.assessment.util;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import org.junit.Test;

import com.assessment.util.FileUtil;

/**
 * @author janga
 *
 */
public class FileUtilTest {
	FileUtil util = new FileUtil();
	
	@Test
	public void shouldReadFileContents() {
		Properties props = util.getCommandList();
		assertTrue(props.containsKey("C"));
		assertTrue(props.containsKey("L"));
		assertTrue(props.containsKey("R"));
		assertTrue(props.containsKey("B"));
	}

}
