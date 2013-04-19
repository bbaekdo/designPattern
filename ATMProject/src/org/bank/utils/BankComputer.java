package org.bank.utils;

import java.util.ArrayList;

import org.bank.account.Account;
import org.bank.transaction.Transaction;

public class BankComputer{

	private int bankId = 9;
	private String bankName = "";
	
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	public static int numOfBanks = 0;
	
	public BankComputer(String newBankName) {
		// TODO Auto-generated constructor stub
		this.bankName = newBankName;
		numOfBanks++;
		this.bankId += numOfBanks;
	}
	
	public void addAccToBank(Account account) {
		// TODO Auto-generated method stub
		this.accounts.add(account);
	}

	public int getBankId() {
		// TODO Auto-generated method stub
		return bankId;
	}

	public void verifyThePIN(Transaction transaction) {
		// TODO Auto-generated method stub
		
	}

	public void requestWithdrawalAmt(Transaction transaction) {
		// TODO Auto-generated method stub
		
	}
	
}
