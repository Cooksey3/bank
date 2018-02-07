package bank;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

	private Map<String, BankAccount> accounts = new HashMap<>();

	public Collection<BankAccount> account() {
		return accounts.values();
	}
	
	public void addAccount(BankAccount account) {
		accounts.put(account.getAccountNumber(), account);
	}

	public int numberOfAccounts() {
		return accounts.size();
	}

	public BankAccount getAccountNumber(String bankAccountNumber) {
		return accounts.get(bankAccountNumber);
	}

	public BankAccount getAccountType(String accountType) {
		return accounts.get(accountType);
	}

	public void deposit(String bankAccountNumber, BigDecimal amount) {
		BankAccount account = getAccountNumber(bankAccountNumber);
		account.deposit(amount);
	}

	public void withdraw(String bankAccountNumber, BigDecimal amount) {
		BankAccount account = getAccountNumber(bankAccountNumber);
		account.withdraw(amount);

	}

	public void removeAccount(BankAccount account) {
		accounts.remove(account.getAccountNumber(), account);
	}

}
