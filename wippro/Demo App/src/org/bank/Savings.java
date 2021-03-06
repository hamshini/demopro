package org.bank;

public class Savings extends BankAccount {
	static double maxAmountCanBetransfered = 100000;
	static int maxNoOfTransactions = 5;
	public double amountTransfered;
	public int noOfTransactionHeld;

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(long accountNumber, String accountHolder, String address, long phoneNumber, String email,
			double balance) {
		super(accountNumber, accountHolder, address, phoneNumber, email, balance);

	}

	@Override
	public boolean withdraw(double amount) {
		//System.out.println("Saving withdraw");
		if (amountTransfered < maxAmountCanBetransfered && noOfTransactionHeld <= maxNoOfTransactions) {
			noOfTransactionHeld++;
			return super.withdraw(amount);
		}
		else{
			System.out.println("Exceeded the max transaction limit");
			System.out.println("Some amount of Rs.100 is charged for each transaction");
			return super.withdraw(amount-100);
		}
		
	}

	@Override
	public boolean deposite(double amount) {

		return super.deposite(amount);
	}

	public double getAmountTransfered() {
		return amountTransfered;
	}

	public void setAmountTransfered(double amountTransfered) {
		this.amountTransfered = amountTransfered;
	}

	public int getNoOfTransactionHeld() {
		return noOfTransactionHeld;
	}

	public void setNoOfTransactionHeld(int noOfTransactionHeld) {
		this.noOfTransactionHeld = noOfTransactionHeld;
	}

}
