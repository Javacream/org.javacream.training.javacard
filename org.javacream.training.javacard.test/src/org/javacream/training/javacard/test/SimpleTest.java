package org.javacream.training.javacard.test;

import org.javacream.training.javacard.Demo;
import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {

	@Test public void testIt() {
		Assert.assertTrue(1 == 1);
	}
	@Test public void testDemo() {
		Assert.assertTrue(Demo.b == 5);
		
	}
}
