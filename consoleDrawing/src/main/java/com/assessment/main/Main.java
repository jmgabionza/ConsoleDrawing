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
	public static void main(String[] args) {
		ConsoleService service = new ConsoleServiceImpl();
		Canvas canvas = null;

		String command = service.getCommand(in);
		String[] parsedCommand = service.parseCommand(command);

		while (parsedCommand.length > 1 && !parsedCommand[0].equalsIgnoreCase("Q")) {
			try {
				service.validate(parsedCommand);

				if (canvas == null && parsedCommand[0].equalsIgnoreCase("C")) {
					canvas = (Canvas) service.createInstance(parsedCommand);
				}

				Drawable drawable = service.createInstance(parsedCommand);
				drawable.draw(canvas);
				canvas = service.outPutCanvas(canvas);
			} catch (Exception e) {
				System.err.println("ERROR - " + e.getMessage());
				System.out.println("Please try again.");

			}finally {
				command = service.getCommand(in);
				parsedCommand = service.parseCommand(command);
			}
		}

		System.out.println("End program.");
		in.close();
	}

}
