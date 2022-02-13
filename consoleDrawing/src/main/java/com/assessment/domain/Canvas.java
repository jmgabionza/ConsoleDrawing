/**
 * 
 */
package com.assessment.domain;

/**
 * @author jangabionza
 *
 */
public class Canvas implements Drawable {

	private int width;
	private int height;
	private String[][] canvasMatrix;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String[][] getCanvasMatrix() {
		return canvasMatrix;
	}

	public void setCanvasMatrix(String[][] canvasMatrix) {
		this.canvasMatrix = canvasMatrix;
	}

	public void draw() {
		String[][] canvasArray = new String[this.getHeight()][this.getWidth()];

		// draw sides
		for (int i = 0; i < this.getHeight(); i++) {
			for (int j = 0; j < this.getWidth(); j++) {
				if (j == 0 || j == this.getWidth() - 1) {
					canvasArray[i][j] = "|";
				} else {
					canvasArray[i][j] = " ";
				}
			}
		}

		// draw top and bottom
		for (int i = 0; i < this.getWidth(); i++) {
			canvasArray[0][i] = "-";
			canvasArray[this.getHeight() - 1][i] = "-";
		}
		this.setCanvasMatrix(canvasArray);
	}

	public Canvas(int width, int height) {
		this.width = width + 2;
		this.height = height + 2;
		draw();
	}

	@Override
	public void draw(Canvas canvas) {
		canvas.draw();
	}
}
