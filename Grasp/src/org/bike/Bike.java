package org.bike;

import org.bike.frame.Frame;
import org.wheel.Wheel;

public class Bike {
	private Wheel wheel;
	private Frame frame;
	
	public Bike(Wheel wheel, Frame frame) {
		super();
		this.wheel = wheel;
		this.frame = frame;
	}
	
	public Bike(int wheel, int frame) {
		this.wheel = new Wheel(wheel);
		this.frame = new Frame(frame);
	}
	
	public static void main(String[] args) {
		Wheel wheel = new Wheel(24);
		Frame frame = new Frame(49);
		Bike bike = new Bike(wheel, frame);
		Bike bike2 = new Bike(24, 30);
	}
	
}
