package org.javacream.training.javacard.test;

import org.javacream.training.javacard.Account;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

	@Test public void testAccount() {
		Account toTest = new Account((byte)1);
		toTest.credit((short)50);
		short account = toTest.getBalance();
		Assert.assertEquals(50, account);
		toTest.debit((short)20);
		Assert.assertEquals(30, toTest.getBalance());
		
	}
}
