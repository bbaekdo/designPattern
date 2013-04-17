package com.llitfkitfk.Demo;

import com.llitfkitfk.abstractFactory.AbstractFactory;
import com.llitfkitfk.abstractFactory.FactoryProducer;
import com.llitfkitfk.inter.Color;
import com.llitfkitfk.inter.Shape;

public class AbstractFactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory shapeFactory =  FactoryProducer.getFactory("SHAPE");
		
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
	
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Color color1 = colorFactory.getColor("Red");
		color1.fill();
		
		Color color2 = colorFactory.getColor("green");
		color2.fill();
		
		Color color3 = colorFactory.getColor("blue");
		color3.fill();

	}

}
