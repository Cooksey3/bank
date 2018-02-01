package bank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankTest {

	@Test
	public void shouldCreateNewBankAccount() {
		Bank underTest = new Bank();
		underTest.createNewAccount(new BankAccount("", "", 0.0));
		int numberOfAccounts = underTest.numberOfAccounts();
		assertEquals(1, numberOfAccounts);

	}

	@Test
	public void shouldCreateAnotherNewBankAccount() {
		Bank underTest = new Bank();
		underTest.createNewAccount(new BankAccount("", "", 0.0));
		underTest.createNewAccount(new BankAccount("1111", "", 0.0));
		int numberOfAccounts = underTest.numberOfAccounts();
		assertEquals(2, numberOfAccounts);
	}

	@Test
	public void shouldDepositMoney() {
		Bank underTest = new Bank();
		underTest.createNewAccount(new BankAccount("", "", 0.0));
		double balance = underTest.deposit("", 30.0);
		assertEquals(30.0, balance, .001);
	}

	@Test
	public void shouldWithdrawMoney() {
		Bank underTest = new Bank();
		underTest.createNewAccount(new BankAccount("", "", 100.0));
		double balance = underTest.withdraw("", 40.0);
		assertEquals(60.0, balance, .001);
	}

	@Test
	public void shouldGetAccountBalance() {
		Bank underTest = new Bank();
		underTest.createNewAccount(new BankAccount("", "", 100.0));
		double balance = underTest.getAccountBalance("", 100.0);
		assertEquals(100.0, balance, .001);
	}

}
