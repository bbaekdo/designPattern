package com.llitfkitfk.abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String option) {
		if(option.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if(option.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		
		return null;
	}
}
