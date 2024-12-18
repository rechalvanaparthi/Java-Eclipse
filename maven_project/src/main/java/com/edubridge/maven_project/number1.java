package com.edubridge.maven_project;

public class number1 {

	    // Instance method to reverse the number
	
	public int getSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += Math.abs(number % 10);
            number /= 10;
        }
        return sum;
    }
	
	    public int reverseNumber(int number) {
	        int reversed = 0;
	        
	        // Loop to reverse the number
	        while (number != 0) {
	            int digit = number % 10; // Get the last digit
	            reversed = reversed * 10 + digit; // Append it to the reversed number
	            number = number / 10; // Remove the last digit
	        }
	        
	        return reversed;
	    }

	    // Instance method to count the number of digits in the number
	    public int countDigits(int number) {
	        int count = 0;
	        
	        // Loop to count the digits
	        while (number != 0) {
	            number = number / 10; // Remove the last digit
	            count++; // Increment the count
	        }
	        
	        return count;
	    }

	    // Instance method to calculate the sum of the reversed number and the number of digits
	    //public int sumReversedAndDigits(int number) {
	        //int reversed = reverseNumber(number); // Get the reversed number
	        //int digitCount = countDigits(number);  // Get the number of digits
	        //return reversed + digitCount; // Return the sum of reversed number and digit count
	   // }
	}

