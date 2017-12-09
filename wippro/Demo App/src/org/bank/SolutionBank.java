package org.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionBank {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BankAccount ba = new BankAccount();
		System.out.println("Enter your account Number");
		ba.setAccountNumber(Long.valueOf(bf.readLine()));
		System.out.println("Enter account holder name");
		ba.setAccountHolder(bf.readLine());
		System.out.println("Enter your address");
		ba.setAddress(bf.readLine());
		System.out.println("Enter your phoneNumber");
		ba.setPhoneNumber(Long.valueOf(bf.readLine()));
		System.out.println("Enter your email");
		ba.setEmail(bf.readLine());
		System.out.println("Enter your balance");
		ba.setBalance(Double.valueOf(bf.readLine()));
		System.out.println("1.Savings \n2.Current Account");
		System.out.println("Enter a number");
		int ch = Integer.valueOf(bf.readLine());

		switch (ch) {
		case 1:
			Savings sv = new Savings();
			System.out.println("1. Withdraw \n2. deposit");
			int wd = Integer.valueOf(bf.readLine());
			switch (wd) {
			case 1:
				System.out.println("Enter the amount to withdraw");
				sv.setAmountTransfered(Double.valueOf(bf.readLine()));
				// sv.withdraw(sv.setAmountTransfered(Double.valueOf(bf.readLine())));
				sv.withdraw(sv.amountTransfered);
				break;
			case 2:
				System.out.println("Amount to deposit");
				sv.setAmountTransfered(Double.valueOf(bf.readLine()));
				sv.deposite(sv.amountTransfered);
				break;
			default:
				break;

			}
			break;
		case 2:
			CurrentAccount ca = new CurrentAccount();
			System.out.println("1. Withdraw \n2. deposit");
			int ca1 = Integer.valueOf(bf.readLine());
			switch (ca1) {
			case 1:
				System.out.println("Enter the amount to withdraw");
				ca.setAmountTransfered(Double.valueOf(bf.readLine()));
				// sv.withdraw(sv.setAmountTransfered(Double.valueOf(bf.readLine())));
				ca.withdraw(ca.amountTransfered);
				break;
			case 2:
				System.out.println("Amount to deposit");
				ca.setAmountTransfered(Double.valueOf(bf.readLine()));
				ca.deposite(ca.amountTransfered);
				break;
			default:
				break;

			}
			break;
		default:
			break;
		}

	}

}
