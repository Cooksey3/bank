package bank;

public class BankAccount {

	private String bankAccountNumber;
	
	public BankAccount(String bankAccountNumber, String accountType, double balance) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getAccountNumber() {
		return bankAccountNumber;
	}

}
