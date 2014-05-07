package com.hilton.git.atm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hilton.git.atm.ATM;

public class TestATM {

	@Test
	public void test() {
		ATM atm = new ATM();
		assertTrue(atm.deposit(200.00));
	}

}
