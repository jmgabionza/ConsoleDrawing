/**
 * 
 */
package com.assessment.service.impl;

import java.util.Scanner;

import com.assessment.domain.Canvas;
import com.assessment.domain.Drawable;
import com.assessment.service.ConsoleService;
import com.assessment.util.DrawingFactory;
import com.assessment.validator.CommandValidator;
import com.assessment.validator.impl.CommandValidatorImpl;

/**
 * @author jangabionza
 *
 */
public class ConsoleServiceImpl implements ConsoleService {
	private CommandValidator commandValidator = new CommandValidatorImpl();
	private DrawingFactory drawingFactory = new DrawingFactory();

	@Override
	public String getCommand(Scanner in) {
		System.out.println("enter command: ");
		String input = in.nextLine();
		return input;
	}

	@Override
	public String[] parseCommand(String command) {
		return command.split(" ");
	}

	@Override
	public Drawable createInstance(String[] command) throws Exception {
		return drawingFactory.createInstance(command);
	}

	@Override
	public Canvas outPutCanvas(Canvas canvas) {
		String[][] canvasArray = canvas.getCanvasMatrix();

		for (int i = 0; i < canvasArray.length; i++) {
			for (int j = 0; j < canvasArray[i].length; j++) {
				System.out.print(canvasArray[i][j]);
			}
			System.out.println();

		}
		return canvas;
	}

	@Override
	public boolean validate(String[] command) {
		boolean isValid = true;
		isValid = commandValidator.isValidCommand(command);
		isValid = commandValidator.isValidDimension(command);
		return isValid;
	}
}
