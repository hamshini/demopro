package org.bank;

public class CurrentAccount extends BankAccount {
	public static double minimumAmountToBeTransfered = 500000;
	public static int minimumNoOfTransactions = 7;
	public double amountTransfered;
	public int noOfTransactionsHeld;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(long accountNumber, String accountHolder, String address, long phoneNumber, String email,
			double balance) {
		super(accountNumber, accountHolder, address, phoneNumber, email, balance);
	}

	@Override
	public boolean withdraw(double amount) {
		amountTransfered += amount;
		if (noOfTransactionsHeld > minimumNoOfTransactions) {
			// cannot be transferred
			System.out.println("You reached the limit of Transaction");
			return false;
		} else if (amountTransfered > minimumAmountToBeTransfered) {
			System.out.println("You cannot transfer this amount. min amount tranfer per day is 500000");
			return false;
		} else {

			balance = balance - amount;
			System.out.println("Remaining Balance:" + balance);
			noOfTransactionsHeld++;
			return true;
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

	public int getNoOfTransactionsHeld() {
		return noOfTransactionsHeld;
	}

	public void setNoOfTransactionsHeld(int noOfTransactionsHeld) {
		this.noOfTransactionsHeld = noOfTransactionsHeld;
	}

}
