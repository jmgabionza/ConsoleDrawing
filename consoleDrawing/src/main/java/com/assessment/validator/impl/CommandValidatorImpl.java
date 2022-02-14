/**
 * 
 */
package com.assessment.validator.impl;

import java.util.Properties;

import com.assessment.exception.ValidationException;
import com.assessment.util.FileUtil;
import com.assessment.validator.CommandValidator;

/**
 * @author jangabionza
 *
 */
public class CommandValidatorImpl implements CommandValidator{
	
	private Properties commands;
	FileUtil util = new FileUtil();

	@Override
	public void isValidCommand(String[] command) throws ValidationException {
		String input = commands.getProperty(command[0]);
		if (null == input) {
			throw new ValidationException("Validation Error - Command not found.");
		}
	}

	@Override
	public void isValidCommandParameters(String[] command) throws ValidationException {
		String input = commands.getProperty(command[0]);
		boolean isValid = false;
		
		switch (input) {
		case "C":
			isValid = command.length == 3?true: false;
			break;
		
		case "L":
			isValid = command.length == 5?true: false;
			break;
		
		case "R":
			isValid = command.length == 5?true: false;
			break;
		
		case "B":
			isValid = command.length == 4?true: false;
			break;

		default:
			//do nothing
		}
		
		if (!isValid) {
			throw new ValidationException("Incorrect command parameters. Please check the input command and try again. ");
		}
	}
	
	public CommandValidatorImpl() {
		this.commands = util.getCommandList();
	}

}
