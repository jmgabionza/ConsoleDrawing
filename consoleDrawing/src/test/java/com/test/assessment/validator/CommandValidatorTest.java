/**
 * 
 */
package com.test.assessment.validator;

import org.junit.Test;
import org.junit.Test.None;

import com.assessment.exception.ValidationException;
import com.assessment.validator.CommandValidator;
import com.assessment.validator.impl.CommandValidatorImpl;

/**
 * @author janga
 *
 */
public class CommandValidatorTest {
	public CommandValidator validator = new CommandValidatorImpl();
	
	@Test(expected = None.class)
	public void shouldValidateCommand() throws ValidationException {
		String[] validCommand = {"C", "40", "4"}; 
		validator.isValidCommand(validCommand);
		
	}
	
	@Test(expected = ValidationException.class)
	public void testInvalidCommandShouldThrowException() throws ValidationException {
		String[] validCommand = {"X", "40", "4"}; 
		validator.isValidCommand(validCommand);
		
	}
	
	@Test(expected = None.class)
	public void testValidParameterShouldThrowException() throws ValidationException {
		String[] validParameter = {"C", "40", "4"}; 
		validator.isValidCommandParameters(validParameter);
		
	}
	
	@Test(expected = ValidationException.class)
	public void testInvalidParameterShouldThrowException() throws ValidationException {
		String[] invalidParameter = {"C", "40"}; 
		validator.isValidCommandParameters(invalidParameter);
		
	}

}
