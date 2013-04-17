package com.llitfkitfk.Demo;

import com.llitfkitfk.object.SingleObject;

public class SingletonPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject ob = SingleObject.getInstance();
		ob.showMessage();
	}

}
