/**
 * 
 */
package com.test.assessment.service;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;

import com.assessment.service.ConsoleService;
import com.assessment.service.impl.ConsoleServiceImpl;

/**
 * @author jangabionza
 *
 */
public class ConsoleServiceTest {
	ConsoleService service = new ConsoleServiceImpl();

	@Test
	public void shouldTakeUserInput() {
		String expected = "C 1 2";
		InputStream in = new ByteArrayInputStream(expected.getBytes());
		System.setIn(in);

		assertEquals(expected, service.getCommand(new Scanner(System.in)));
	}

	@Test
	public void shouldParseCommandBySpaces() {
		String[] expected = { "C", "1", "2" };
		String command = "C 1 2";
		String[] result = service.parseCommand(command);
		assertArrayEquals(expected, result);
	}

}
