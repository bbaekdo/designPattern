package org.bank.account;

public class Account {
	private int bankId;
	private int accNum;
	private String customerName;
	private String accType;
	private double accBalance;
	private int pin;
	private int stripNum;
	
	static int accNumIncrementor = 100000;
	
	public Account(int bankId, String customerName, String accType,
			double accBalance, int pin) {
		super();
		this.bankId = bankId;
		this.customerName = customerName;
		this.accType = accType;
		this.accBalance = accBalance;
		this.pin = pin;
		this.stripNum = generateStripNum(bankId);
		
		this.accNum = generateAccNum(stripNum, accType);
	}

	private int generateAccNum(int stripNum2, String accType2) {
		// TODO Auto-generated method stub
		if(accType.startsWith("s") ||accType.startsWith("S")) {
			accNum = (stripNum*10) + 1;
		} else {
			accNum = (stripNum*10) + 2;
		}
		return accNum;
	}

	private int generateStripNum(int bankId2) {
		// TODO Auto-generated method stub
		accNumIncrementor++;
		int newStripNum = (bankId*10000000) + accNumIncrementor;
		
		return newStripNum;
	}

	public int getBankId() {
		return bankId;
	}

	public int getAccNum() {
		return accNum;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAccType() {
		return accType;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public int getPin() {
		return pin;
	}

	public int getStripNum() {
		return stripNum;
	}
	
	
	
}
