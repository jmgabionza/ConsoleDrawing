/**
 * 
 */
package com.assessment.service;

import java.util.Scanner;

import com.assessment.domain.Canvas;
import com.assessment.domain.Drawable;
import com.assessment.exception.ValidationException;

/**
 * @author jangabionza
 *
 */
public interface ConsoleService {
	
	public String getCommand(Scanner in);
	public String[] parseCommand(String command);
	public void validate(String[] command) throws ValidationException;
	public Drawable createInstance(String[] command) throws Exception;
	public Canvas outPutCanvas(Canvas canvas);
}
