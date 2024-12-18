package com.edubridge.maven_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class number1Test {
	    private number1 n = null;

	    // Setup method - runs before each test
	    @BeforeEach
	    public void setup() {
	        n = new number1();
	        System.out.println("BeforeEach");
	    }
	    
	    // TearDown method - runs after each test
	    @AfterEach
	    public void tearup() {
	        n = null;
	        System.out.println("AfterEach");
	    }
	    
	 // Test for sumoftheNumber method
	    @Test
	    public void testSumofDigits() {
	        int actual = n.getSumOfDigits(123);
	        int expected = 6 ;
	        
	        // Test to check if the reverse number method works correctly
	        assertEquals(expected, actual);
	    }

	    
	    // Test for reverseNumber method
	    @Test
	    public void testReverseNumber() {
	        int actual = n.reverseNumber(123);
	        int expected = 321;
	        
	        // Test to check if the reverse number method works correctly
	        assertEquals(expected, actual);
	    }

	    // Test for countDigits method
	    @Test
	    public void testCountDigits() {
	        int actual = n.countDigits(123);
	        int expected = 3; // The number 12345 has 5 digits
	        
	        // Test to check if the digit counting method works correctly
	        assertEquals(expected, actual);
	    }

	   /* Test for sumReversedAndDigits method
	    @Test
	    public void testSumReversedAndDigits() {
	        int actual = n.sumReversedAndDigits(12345);
	        int expected = 54326; // 54321 (reversed) + 5 (number of digits) = 54326
	        
	        // Test to check if the sum of reversed number and digits is calculated correctly
	        assertEquals(expected, actual);
	    
	}*/

}
