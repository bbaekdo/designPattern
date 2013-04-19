package org.bank.card;

public class Card {
	
	private int pin;
	private int stripNum;
	
	public Card(int pin, int stripNum) {
		// TODO Auto-generated constructor stub
		this.pin = pin;
		this.stripNum = stripNum;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getStripNum() {
		return stripNum;
	}

	public void setStripNum(int stripNum) {
		this.stripNum = stripNum;
	}
	
	
	

}
