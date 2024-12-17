package entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double balance;

	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = 0;
	}

	public Account(int accountNumber, String accountHolder, double initialDepositValue) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDepositValue);
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void deposit (double depositValue) {
		this.balance += depositValue;
	}
	
	public void withdraw (double withdrawValue) {
		this.balance -= (withdrawValue + 5.00);
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ accountHolder
				+ ", Balance: $ "
				+ String.format("%.2f%n%n", balance);
	}

}
