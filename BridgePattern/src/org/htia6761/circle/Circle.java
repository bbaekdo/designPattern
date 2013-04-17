package org.htia6761.circle;

import org.htia6761.inter.DrawAPI;
import org.htia6761.shape.Shape;

public class Circle extends Shape {

	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;

	}

	public void draw() {
		drawAPI.drawCirlce(radius, x, y);
	}

}
