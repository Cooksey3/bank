package bank;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BankAccountTest {
	
	@Test
	public void shouldCreateBankAccountConstructor() {
		BankAccount underTest = new BankAccount("", "", 0.0);
		assertNotNull(underTest);
	}
	
}
