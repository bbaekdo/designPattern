package com.llitfkitfk.abstractFactory;

import com.llitfkitfk.inter.Color;
import com.llitfkitfk.inter.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
