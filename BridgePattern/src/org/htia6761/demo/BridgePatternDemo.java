package org.htia6761.demo;

import org.htia6761.circle.Circle;
import org.htia6761.circle.GreenCircle;
import org.htia6761.circle.RedCircle;
import org.htia6761.shape.Shape;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(10, 10, 10, new RedCircle());
		Shape greenCircle = new Circle(10, 10, 10, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
		
	}
}
