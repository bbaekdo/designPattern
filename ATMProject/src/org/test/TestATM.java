package org.test;

import org.bank.account.Account;
import org.bank.atm.ATM;
import org.bank.card.Card;
import org.bank.customer.Customer;
import org.bank.network.BankNetwork;
import org.bank.utils.BankComputer;

public class TestATM {
	
	public static void main(String[] args) {
		Account account  = new Account(10, "Paul", "C", 10000.00, 3456);
		
		Card customerATMCard = new Card(account.getPin(), account.getStripNum());
		
		new Customer(customerATMCard);
		
		BankComputer anzBankComputer = new BankComputer("ANZ Bank");
		
		anzBankComputer.addAccToBank(account);
		
		BankNetwork bankNetwork = new BankNetwork();  
		
		bankNetwork.addBankToNetwork(anzBankComputer);
		
		ATM mainATM = new ATM(bankNetwork);
		
		mainATM.isStripReadable(customerATMCard);
		
		mainATM.isATMCardInNetwork(customerATMCard);
		
		mainATM.insertPIN(customerATMCard, 1234);
		
		mainATM.pickAccToAccess();
		
		mainATM.amountToWithdrawal();
		
		mainATM.generateTransactionInfo();
		
	}
}
