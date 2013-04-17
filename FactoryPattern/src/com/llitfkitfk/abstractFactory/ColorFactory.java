package com.llitfkitfk.abstractFactory;

import com.llitfkitfk.Color.Blue;
import com.llitfkitfk.Color.Green;
import com.llitfkitfk.Color.Red;
import com.llitfkitfk.inter.Color;
import com.llitfkitfk.inter.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if(color == null) {
			return null;
		}
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if(color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if(color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
