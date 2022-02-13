/**
 * 
 */
package com.assessment.domain;

/**
 * @author janga
 *
 */
public class Line implements Drawable {

	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	@Override
	public void draw(Canvas canvas) {
		String[][] canvasMatrix = canvas.getCanvasMatrix();
		int x1 = this.x1;
		int x2 = this.x2;
		int y1 = this.y1;
		int y2 = this.y2;
		
		//vertical
		if (x1 - x2 == 0) {
			if (y1 > y2) {
				while ( y1-y2 >= 0) {
					canvasMatrix[y1][x1] = "x";
					y1--;
				}
			}
			else {
				while ( y2-y1 >= 0) {
					canvasMatrix[y2][x2] = "x";
					y2--;
				}
			}
			
			
		//horizontal line
		}else {
			if (x1 > x2) {
				while ( x1-x2 >= 0) {
					canvasMatrix[y1][x1] = "x";
					x1--;
				}
			}
			else {
				while ( x2-x1 >= 0) {
					canvasMatrix[y2][x2] = "x";
					x2--;
				}
			}
		}
		canvas.setCanvasMatrix(canvasMatrix);
	}

}
