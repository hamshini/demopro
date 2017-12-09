package org.bank;

public class BankAccount {

	public BankAccount() {
		super();
	}

	public BankAccount(long accountNumber, String accountHolder, String address, long phoneNumber, String email,
			double balance) {
		super();
		this.accountNumber = accountNumber;
		AccountHolder = accountHolder;
		Address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.balance = balance;
	}
	public boolean withdraw(double amount){
		
		//this.balance= this.balance-amount;
		return true;
	}
	public boolean deposite(double amount){
	//	balance= this.balance+amount;
		return true;
	}
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return AccountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	private long accountNumber;
	private String AccountHolder;
	private String Address;
	private long phoneNumber;
	private String email;
	protected double balance;
}
