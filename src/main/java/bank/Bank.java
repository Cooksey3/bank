package bank;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

	private Map<String, BankAccount> accounts = new HashMap<>();

	//Passes
	public void add(BankAccount account) {
		accounts.put(account.getAccountNumber(), account);
	}

	//Passes
	public int numberOfAccounts() {
		return accounts.size();
	}

	public BankAccount getAccountNumber(String bankAccountNumber) {
		return accounts.get(bankAccountNumber);
	}
	
	public BankAccount getAccountType(String accountType) {
		return accounts.get(accountType);
	}

	public void deposit(String bankAccountNumber, String amount) {
		BankAccount depositToAccount = getAccountNumber(bankAccountNumber);
		depositToAccount.deposit(amount);
	}

//	public Collection<BankAccount> accounts() {
//		return accounts.values();
//	}


}
