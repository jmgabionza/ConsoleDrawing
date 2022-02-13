/**
 * 
 */
package com.assessment.util;

import com.assessment.domain.Canvas;
import com.assessment.domain.Drawable;
import com.assessment.domain.Fill;
import com.assessment.domain.Line;
import com.assessment.domain.Rectangle;

/**
 * @author jangabionza
 *
 */
public class DrawingFactory {
	public Drawable createInstance(String[] command) throws Exception {
		switch (command[0]) {
		case "C":
			return new Canvas(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
		
		case "L":
			return new Line(Integer.parseInt(command[1]), Integer.parseInt(command[2]), Integer.parseInt(command[3]), Integer.parseInt(command[4]));
		
		case "R":
			return new Rectangle(Integer.parseInt(command[1]), Integer.parseInt(command[2]), Integer.parseInt(command[3]), Integer.parseInt(command[4]));
		
		case "B":
			return new Fill(Integer.parseInt(command[1]), Integer.parseInt(command[2]), command[3]);

		default:
			break;
		}
		throw new Exception("unknown instance");
	}
}
