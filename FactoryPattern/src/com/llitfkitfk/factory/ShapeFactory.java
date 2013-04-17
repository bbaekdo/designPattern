package com.llitfkitfk.factory;

import com.llitfkitfk.inter.Shape;
import com.llitfkitfk.shape.Circle;
import com.llitfkitfk.shape.Rectangle;
import com.llitfkitfk.shape.Square;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		return null;
	}
}
