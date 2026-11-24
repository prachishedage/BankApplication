package com.exponent.bankapplication.model;

public class Account {
	
	private int accountNumber;
	private String name;
	private String adharcardNumber;
	private String pancardNumber;
	private String email;
	private long contact;
	private double accountBalance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharcardNumber() {
		return adharcardNumber;
	}

	public void setAdharcardNumber(String adharcardNumber) {
		this.adharcardNumber = adharcardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}


	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "\n========== ACCOUNT DETAILS ==========\n"
	            + "Account Number : " + accountNumber + "\n"
	            + "Name           : " + name + "\n"
	            + "Aadhaar Number : " + adharcardNumber + "\n"
	            + "Pancard Number : " + pancardNumber + "\n"
	            + "Contact        : " + contact + "\n"
	            + "Email          : " + email + "\n"
	            + "Account Balance: " + accountBalance + "\n"
	            + "=====================================";	}


}
