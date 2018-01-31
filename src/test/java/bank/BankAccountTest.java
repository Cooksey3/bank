package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BankAccountTest {
	
	@Test
	public void shouldCreateBankAccountConstructor() {
		BankAccount underTest = new BankAccount("", "", 0.0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldGenerateAccountNumber() {
		BankAccount underTest = new BankAccount("1111", "", 0.0);
		String accountNumber = underTest.getAccountNumber();
		assertEquals("1111", accountNumber);
	}
	
	@Test
	public void shouldGenerateSecondAccountNumber() {
		BankAccount underTest = new BankAccount("2222", "", 0.0);
		String accountNumber = underTest.getAccountNumber();
		assertEquals("2222", accountNumber);
	}
	
	@Test
	public void shouldGenerateAccountType() {
		BankAccount underTest = new BankAccount("", "Checking", 0.0);
		String accountType = underTest.getAccountType();
		assertEquals("Checking", accountType);
	}
	
	@Test
	public void shouldGenerateAnotherAccountType() {
		BankAccount underTest = new BankAccount("", "Savings", 0.0);
		String accountType = underTest.getAccountType();
		assertEquals("Savings", accountType);
	}
	
	@Test
	public void shouldGenerateBalance() {
		BankAccount underTest = new BankAccount("", "Savings", 10.0);
		double balance = underTest.getBalance();
		assertEquals(10.0, balance, .001);
	}
	
	@Test
	public void shouldBeAbleToGenerateMultipleBalances() {
		BankAccount underTest = new BankAccount("", "Savings", 20.0);
		double balance = underTest.getBalance();
		assertEquals(20.0, balance, .001);
	}
}
