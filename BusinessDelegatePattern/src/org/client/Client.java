package org.client;

import org.business.delegate.BusinessDelegate;

public class Client {
	BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate) {
		// TODO Auto-generated constructor stub
		this.businessDelegate = businessDelegate;
	}
	
	public void doTask() {
		businessDelegate.doTask();
	}
}
