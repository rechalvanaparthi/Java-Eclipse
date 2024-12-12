package com.edubridge.maven_project;

//import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
	
	
	private Calc c = null;
		
	@BeforeEach
	public void setup() {
		c = new Calc();
		System.out.println("BeforeEach");
}
	
	@AfterEach
	public void tearup() {
		c = new Calc();
		System.out.println("AfterEach");
	}
	
	
	@Test
	public void testFindsquare() {
		Calc c = new Calc();
		int actual = c.findSquare(10);
		int expected = 100;
		
		
		//to test
		assertEquals(expected,actual);
		
	}
	@Test
	public void testFindCube() {
		Calc c = new Calc();
		int actual = c.findCube(10);
		int expected = 1000;
		
		assertEquals(expected, actual);
	}
	
}
