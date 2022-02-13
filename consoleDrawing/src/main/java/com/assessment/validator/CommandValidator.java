/**
 * 
 */
package com.assessment.validator;

/**
 * @author jangabionza
 *
 */
public interface CommandValidator {
	
	public boolean isValidCommand(String[] command);
	public boolean isValidDimension(String[] command);

}
