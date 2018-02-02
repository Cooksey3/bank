package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class BankTest {

	private static final String ACCOUNT_NUMBER = "12345";

	private static final String ACCOUNT_TYPE = "Checking";

	private Bank underTest;

	private BankAccount account;

	@Before
	public void setup() {
		underTest = new Bank();

		account = new BankAccount(ACCOUNT_NUMBER, ACCOUNT_TYPE, new BigDecimal("0.0"));
	}

	@Test
	public void shouldCreateNewBankAccount() {
		underTest = new Bank();
		underTest.add(account);
		int numberOfAccounts = underTest.numberOfAccounts();
		assertEquals(1, numberOfAccounts);

	}

	@Test
	public void shouldCreateAnotherNewBankAccount() {
		String newAccountNumber = "12343";
		BankAccount newAccount2 = new BankAccount(newAccountNumber, ACCOUNT_TYPE, new BigDecimal("0.0"));
		underTest = new Bank();
		underTest.add(account);
		underTest.add(newAccount2);
		int numberOfAccounts = underTest.numberOfAccounts();
		assertEquals(2, numberOfAccounts);
	}

	@Test
	public void shouldGetAccountNumber() {
		underTest = new Bank();
		BankAccount newAccount = new BankAccount("123432", ACCOUNT_TYPE, "500.00");
		underTest.add(newAccount);
		String accountNumber = newAccount.getAccountNumber();
		assertEquals("123432", accountNumber);
	}

	@Test
	public void shouldDepositMoney() {
		underTest = new Bank();
		BankAccount newAccount = new BankAccount(ACCOUNT_NUMBER, ACCOUNT_TYPE, "500.00");
		underTest.add(newAccount);
		String balance = newAccount.deposit(ACCOUNT_NUMBER, "30.00");
		assertEquals("530.00", balance);
	}

//	@Test
//	public void shouldWithdrawMoney() {
//		
//	}

//	@Test
//	public void shouldGetAccountType() {
//
//	}

}
