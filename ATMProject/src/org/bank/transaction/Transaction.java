package org.bank.transaction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.xml.crypto.Data;

public class Transaction {
	
	DateFormat dataFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	private int bankId;
	private Data currentData;
	private String customerName;
	private double accBalance;
	private int withdrawalAmt;
	private int accNumUsed;
	private int pin;
	private int stripNum;
	private int accToWithdrawalFrom;
	
	private boolean didCardVerify = false;
	
	public Transaction(int stripNum) {
		// TODO Auto-generated constructor stub
		this.stripNum = stripNum;
	}

	public void setStripNum(int stripNum) {
		// TODO Auto-generated method stub
		this.stripNum = stripNum;
	}

	public void setDidtheCardVerify(boolean b) {
		// TODO Auto-generated method stub
		didCardVerify = (b)? true: false;
	}

	public void setPIN(int i) {
		// TODO Auto-generated method stub
		this.pin = i;
	}

	public boolean getDidCardVerify() {
		// TODO Auto-generated method stub
		return didCardVerify;
	}

	public int getBankId() {
		// TODO Auto-generated method stub
		return bankId;
	}

	public void setAccTowithdrawalFrom(int numEnter) {
		// TODO Auto-generated method stub
		this.accToWithdrawalFrom = numEnter;
		this.accNumUsed = (stripNum * 10) + accToWithdrawalFrom;
	}

	public void setWithdrawalAmt(int numEnter) {
		// TODO Auto-generated method stub
		this.withdrawalAmt = numEnter;
	}

}
