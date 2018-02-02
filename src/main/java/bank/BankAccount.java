package bank;

import java.math.BigDecimal;

public class BankAccount {

	private String number;
	private String accountType;
	private BigDecimal balance;

	public BankAccount(String bankAccountNumber, String accountType, BigDecimal balance) {
		this.number = bankAccountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}

	public BankAccount(String bankAccountNumber, String accountType, String balance) {
		this(bankAccountNumber, accountType, new BigDecimal(balance));
	}

	public String getAccountNumber() {
		return number;
	}

	public String getAccountType() {
		return accountType;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account Number: " + number;
	}

	public void withdraw(String amount) {
		BigDecimal withdrawAmount = new BigDecimal(amount);
		balance = balance.subtract(withdrawAmount);
	}

	public void deposit(String amount) {
		BigDecimal depositAmount = new BigDecimal(amount);
		balance = balance.add(depositAmount);
	}
}
