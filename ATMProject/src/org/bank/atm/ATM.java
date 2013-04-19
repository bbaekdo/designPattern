package org.bank.atm;

import java.util.Scanner;

import org.bank.card.Card;
import org.bank.network.BankNetwork;
import org.bank.transaction.Transaction;

public class ATM {

	private Transaction transaction = null; 
	private BankNetwork bankNetwork = null;
	
	static Scanner userInput = new Scanner(System.in);
	
	public ATM(BankNetwork bankNetwork) {
		// TODO Auto-generated constructor stub
		this.bankNetwork = bankNetwork;
	}

	public boolean isStripReadable(Card customerATMCard) {
		int numOfDigitsInStrip = (int) (Math.log10(customerATMCard.getStripNum()) + 1);
		transaction = new Transaction(customerATMCard.getStripNum());
		
		if(numOfDigitsInStrip == 10) {
			return true;
		} else {
			return false;
		}
		
	}

	public boolean isATMCardInNetwork(Card customerATMCard) {

		if(bankNetwork.isATMCardsInNetwork(customerATMCard)) {
			transaction.setStripNum(customerATMCard.getStripNum());
			transaction.setDidtheCardVerify(true);
			return true;
		} else {
			return false;	
		}
		
		
	}

	public boolean insertPIN(Card customerATMCard, int i) {
		// TODO Auto-generated method stub
		int numOfDigitsInPin = (int) (Math.log10(i)+1);
		if(numOfDigitsInPin !=4) {
			System.out.println("enter 4 digits for a pin");
			return false;
		} else {
			transaction.setPIN(i);
			bankNetwork.verifyThePIN(transaction);
		}
		return false;
	}

	public void pickAccToAccess() {
		// TODO Auto-generated method stub
		System.out.println("what account do you want to withdrawal from");
		System.out.println("1 - saving, 2 -checking");
		
		if(userInput.hasNextInt()) {
			int numEnter = userInput.nextInt();
			transaction.setAccTowithdrawalFrom(numEnter);
		} else {
			System.out.println("you enter an invalid option");
		}
	}

	public void amountToWithdrawal() {
		// TODO Auto-generated method stub
		System.out.println("how much withdrawal");
		System.out.println("increments of 10"); 
		
		if(userInput.hasNextInt()) {
			int numEnter = userInput.nextInt();
			transaction.setWithdrawalAmt(numEnter);
			bankNetwork.requestWithdrawalAmt(transaction);
		} else {
			System.out.println("you enter an invalid amount");
		}
	}

	public void generateTransactionInfo() {
		// TODO Auto-generated method stub
		
	}

}
