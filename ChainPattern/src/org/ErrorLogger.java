package org;

public class ErrorLogger extends AbstactLogger {

	public ErrorLogger(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Error logger:" + message);
	}
	
}
