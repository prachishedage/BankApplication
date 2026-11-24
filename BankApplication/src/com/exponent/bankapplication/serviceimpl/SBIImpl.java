package com.exponent.bankapplication.serviceimpl;

import java.util.Scanner;

import com.exponent.bankapplication.model.Account;
import com.exponent.bankapplication.service.RBI;

public class SBIImpl implements RBI {
	
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void createAccount() {
		
		System.out.println("Enter your name: ");
		ac.setName(sc.next());
		System.out.println("Enter your Addhar number: ");
		ac.setAdharcardNumber(sc.next());
		System.out.println("Enter your Pancard number: ");
		ac.setPancardNumber(sc.next());
		System.out.println("Enter your account number: ");
		ac.setAccountNumber(sc.nextInt());
		System.out.println("Enter your valid Email-id: ");
		ac.setEmail(sc.next());
		System.out.println("Enter your valid Contact number: ");
		ac.setContact(sc.nextLong());
		System.out.println("Enter account opening amount: ");
		ac.setAccountBalance(sc.nextDouble());
		System.out.println("*********Account is created successfully**********");

	}

	@Override
	public void showAccountDetails() {
		System.out.println("Enter your account number: ");
		int AccontNo = sc.nextInt();
		if (AccontNo == ac.getAccountNumber()) {
			System.out.println(ac);
		} else {
			System.out.println("This account doesn't exist.");
		}
	}

	@Override
	public void showAccountBalance() {
		System.out.println("Enter your account number: ");
		int AccontNo = sc.nextInt();
		if (AccontNo == ac.getAccountNumber()) {
			System.out.println("Current Account balance: " + ac.getAccountBalance());
		} else {
			System.out.println("Account doesn't exist.");
		}
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Enter the amount you want to withdraw: ");
		double withDraw = sc.nextDouble();
		if (withDraw >= ac.getAccountBalance()) {
			System.out.println("Insufficient Balance");
			return;
		}
		double updatedBalance = ac.getAccountBalance() - withDraw;
		ac.setAccountBalance(updatedBalance);
		System.out.println("Succesfull withdraw of Rs. " + withDraw);
		System.out.println("Your current updated balance is: " + updatedBalance);
	}

	@Override
	public void depositeMoney() {
		System.out.println("Enter the amount you want to deposit: ");
		double deposit = sc.nextDouble();
		double updatedBalance = ac.getAccountBalance() + deposit;
		ac.setAccountBalance(updatedBalance);
		System.out.println("Amount Deposited Successfully");
		System.out.println("Your current updated balance is: " + updatedBalance);

	}

	@Override
	public void updateAccountDetails() {
		System.out.println("___________________________");
		System.out.println("|  Update Account detail   |");
		System.out.println("----------------------------");
		System.out.println("|1.|  Update Name          |");
		System.out.println("|2.| Update Email number   |");
		System.out.println("|3.|Update Contact Address |");
		System.out.println("|__|_______________________|");
		System.out.println("********Enter your choice:********");

		int ch = sc.nextInt();

		switch(ch) {
	    case 1:
	    	System.out.println("Enter new name");
	    	ac.setName(sc.next());
	    	System.out.println("Name updated succesfully");
	    break;    
	    case 2:
	    	System.out.println("Enter new Email Id");
	    	ac.setEmail(sc.next());
	    	System.out.println("Email Id updated succesfully");
	   break;
	    case 3:
	    	System.out.println("Enter new Contact No");
	    	ac.setContact(sc.nextLong());
	    	System.out.println("Contact no updated succesfully");
	    	break;
	    
	    }
	}
	

}
