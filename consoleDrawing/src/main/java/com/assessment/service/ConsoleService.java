/**
 * 
 */
package com.assessment.service;

import java.util.Scanner;

import com.assessment.domain.Canvas;
import com.assessment.domain.Drawable;

/**
 * @author jangabionza
 *
 */
public interface ConsoleService {
	
	public String getCommand(Scanner in);
	public String[] parseCommand(String command);
	public boolean validate(String[] command);
	public Drawable createInstance(String[] command) throws Exception;
	public Canvas outPutCanvas(Canvas canvas);
}
