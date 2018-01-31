package bank;

public class BankAccount {

	private String bankAccountNumber;
	private String accountType;
	
	public BankAccount(String bankAccountNumber, String accountType, double balance) {
		this.bankAccountNumber = bankAccountNumber;
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return bankAccountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return 10.0;
	}

}
