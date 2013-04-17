package org.htia6761.shape;

import org.htia6761.inter.DrawAPI;

public abstract class Shape {
	protected DrawAPI drawAPI;
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
