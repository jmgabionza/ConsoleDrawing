/**
 * 
 */
package com.assessment.domain;

/**
 * @author jangabionza
 *
 */
public class Fill implements Drawable {
	private int x;
	private int y;
	private String color;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Fill(int x, int y, String color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}

	@Override
	public void draw(Canvas canvas) throws Exception {
		if (null == canvas) {
			throw new Exception("No canvas detected. Please create a canvas first before drawing.");
		}
		
		String[][] canvasMatrix = canvas.getCanvasMatrix();
		int y = this.y;
		int x = this.x;
		String newColor = this.color;

		String color = canvasMatrix[y][x];
		if (color != newColor) {
			fill(canvasMatrix, y, x, color, newColor);
		}

		canvas.setCanvasMatrix(canvasMatrix);

	}

	private void fill(String[][] canvasMatrix, int y, int x, String color, String newColor) {
		if (canvasMatrix[y][x] == color) {
			canvasMatrix[y][x] = newColor;
			if (y >= 1) {
				fill(canvasMatrix, y - 1, x, color, newColor);
			}

			if (x >= 1) {
				fill(canvasMatrix, y, x - 1, color, newColor);
			}

			if (y + 1 < canvasMatrix.length) {
				fill(canvasMatrix, y + 1, x, color, newColor);
			}

			if (x + 1 < canvasMatrix[0].length) {
				fill(canvasMatrix, y, x + 1, color, newColor);
			}

		}
	}

}
