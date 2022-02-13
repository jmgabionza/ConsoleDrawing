/**
 * 
 */
package com.assessment.main;

import java.util.Scanner;

import com.assessment.domain.Canvas;
import com.assessment.domain.Drawable;
import com.assessment.service.ConsoleService;
import com.assessment.service.impl.ConsoleServiceImpl;

/**
 * 
 * @author jangabionza
 *
 */
public class Main {
	static final Scanner in = new Scanner(System.in);

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ConsoleService service = new ConsoleServiceImpl();
		Canvas canvas = null;
		
		String command = service.getCommand(in);
		String[] parsedCommand = service.parseCommand(command);
		
		while (parsedCommand.length > 1 && !parsedCommand[0].equalsIgnoreCase("Q")) {
			
			if (canvas == null && parsedCommand[0].equalsIgnoreCase("C")) {
				canvas = (Canvas) service.createInstance(parsedCommand);
			}
			
			Drawable drawable = service.createInstance(parsedCommand);
			drawable.draw(canvas);
			canvas = service.outPutCanvas(canvas);

			command = service.getCommand(in);
			parsedCommand = service.parseCommand(command);
		}

		System.out.println("End program.");
		in.close();
	}

}
