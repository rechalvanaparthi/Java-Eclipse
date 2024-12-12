package com.edubridge.maven_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyCalcTest {

	@Test
	public void testSum() {
		MyCalc mc = new MyCalc();
		int actual = mc.sum(1, 2);
		int expected = 3;
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testSub() {
		MyCalc mc = new MyCalc();
		int actual = mc.sub(2, 2);
		int expected = 0;
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testMul() {
		MyCalc mc = new MyCalc();
		int actual = mc.mul(1, 2);
		int expected = 2;
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testDiv() {
		MyCalc mc = new MyCalc();
		int actual = mc.div(10, 5);
		int expected = 2;
		
		Assertions.assertEquals(expected, actual);
	}
	
}
