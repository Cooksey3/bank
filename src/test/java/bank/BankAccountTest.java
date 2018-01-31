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
}
