package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.Assert;

public class BankAccountTest {

	@Test
	public void shouldCreateBankAccountConstructor() {
		BankAccount underTest = new BankAccount("", "", new BigDecimal("0.0"));
		assertNotNull(underTest);
	}

	@Test
	public void shouldGenerateAccountNumber() {
		BankAccount underTest = new BankAccount("1111", "", new BigDecimal("0.0"));
		String accountNumber = underTest.getAccountNumber();
		assertEquals("1111", accountNumber);
	}

	@Test
	public void shouldGenerateSecondAccountNumber() {
		BankAccount underTest = new BankAccount("2222", "", new BigDecimal("0.0"));
		String accountNumber = underTest.getAccountNumber();
		assertEquals("2222", accountNumber);
	}

	@Test
	public void shouldGenerateAccountType() {
		BankAccount underTest = new BankAccount("", "Checking", new BigDecimal("0.0"));
		String accountType = underTest.getAccountType();
		assertEquals("Checking", accountType);
	}

	@Test
	public void shouldGenerateAnotherAccountType() {
		BankAccount underTest = new BankAccount("", "Savings", new BigDecimal("0.0"));
		String accountType = underTest.getAccountType();
		assertEquals("Savings", accountType);
	}

	@Test
	public void shouldGetBalance() {
		BankAccount underTest = new BankAccount("", "Savings", new BigDecimal("10.0"));
		BigDecimal balance = underTest.getBalance();
		assertEquals(balance, new BigDecimal("10.0"));
	}

	@Test
	public void shouldBeAbleToGenerateMultipleBalances() {
		BankAccount underTest = new BankAccount("", "Savings", new BigDecimal("20.0"));
		underTest.getBalance();
		assertEquals(underTest.getBalance(), new BigDecimal("20.0"));
	}
	
	@Test
	public void shouldWithdrawMoney() {
		BankAccount underTest = new BankAccount("1111", "Savings", new BigDecimal("100.00"));
		underTest.withdraw(new BigDecimal("10.00"));
		assertEquals(underTest.getBalance(), new BigDecimal("90.00"));
	}
	
	@Test
	public void shouldDepositMoney() {
		BankAccount underTest = new BankAccount("1111", "Savings", new BigDecimal("100.00"));
		underTest.deposit(new BigDecimal("10.00"));
		assertEquals(underTest.getBalance(), new BigDecimal("110.00"));
	}
	
	@Test
	public void shouldPrintProperAccountInfo() {
		BankAccount underTest = new BankAccount("1111", "Savings", new BigDecimal("10.00"));
		String accountInfo = underTest.toString();
		assertEquals(accountInfo, ("Account Number: " + underTest.getAccountNumber()));
	}
}
