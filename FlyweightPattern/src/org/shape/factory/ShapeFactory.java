package org.shape.factory;

import java.util.HashMap;

import org.shape.Circle;
import org.shape.Shape;

public class ShapeFactory {
	
	private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();
	
	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);
		
		if(circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Create circle color " + color);
		}
		
		return circle;
			
	}
}
