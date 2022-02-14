/**
 * 
 */
package com.test.assessment.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.assessment.domain.Canvas;
import com.assessment.domain.DrawingFactory;
import com.assessment.domain.Fill;
import com.assessment.domain.Line;
import com.assessment.domain.Rectangle;

/**
 * @author jangabionza
 *
 */
public class DrawingFactoryTest {
	
	DrawingFactory factory = new DrawingFactory();
	
	@Test
	public void shouldCreateCanvas() throws Exception {
		Object result = factory.createInstance(new String[] {"C", "20", "4"});
		assertTrue(result instanceof Canvas);
	}
	
	@Test
	public void shouldCreateLine() throws Exception {
		Object result = factory.createInstance(new String[] {"L", "1", "2", "3", "4"});
		assertTrue(result instanceof Line);
	}
	
	@Test
	public void shouldCreateRectangle() throws Exception {
		Object result = factory.createInstance(new String[] {"R", "1", "2", "3", "4"});
		assertTrue(result instanceof Rectangle);
	}
	
	@Test
	public void shouldCreateFill() throws Exception {
		Object result = factory.createInstance(new String[] {"B", "1", "2", "o"});
		assertTrue(result instanceof Fill);
	}
	

}
