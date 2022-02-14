/**
 * 
 */
package com.assessment.validator;

import com.assessment.exception.ValidationException;

/**
 * @author jangabionza
 *
 */
public interface CommandValidator {
	
	public void isValidCommand(String[] command) throws ValidationException;
	public void isValidCommandParameters(String[] command)throws ValidationException;

}
