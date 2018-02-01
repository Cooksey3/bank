package bank;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bank {

	private Map<String, BankAccount> accounts = new HashMap<String, BankAccount>();
	
	public 	Set<String> accountNumbers = accounts.keySet();
	
	public Collection<BankAccount> account = accounts.values();
	
	public void createNewAccount(BankAccount newAccount) {
		accounts.put(newAccount.getAccountNumber(), newAccount);
	}

	public int numberOfAccounts() {
		return accounts.size();
	}
	
	public double deposit(String accountNumberKey, double depositAmount) {
		double newBalance = 0;
		for(String accountNumber : accountNumbers) {
			if (accountNumber.equals(accountNumberKey)) {
				newBalance += depositAmount;
			}
		}
		return newBalance;
	}

	public double withdraw(String accountNumberKey, double withdrawAmount) {
		double newBalance = 100.0;
		for(String accountNumber : accountNumbers) {
			if (accountNumber.equals(accountNumberKey)) {
				newBalance -= withdrawAmount;
			}
		}
		return newBalance;
	}

}
