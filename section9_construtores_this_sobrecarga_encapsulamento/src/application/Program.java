package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double initialDepositValue = 0;
		Account account;

		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		String accountHolder = sc.next();
		System.out.println("Is there na initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);

		if (initialDeposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			initialDepositValue = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDepositValue);
		} else {
			account = new Account(accountNumber, accountHolder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();

	}

}
