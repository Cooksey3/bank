package bank;

public class BankAccount {

	private String bankAccountNumber;
	private String accountType;
	private double balance;
	
	public BankAccount(String bankAccountNumber, String accountType, double balance) {
		this.bankAccountNumber = bankAccountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return bankAccountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}

}
