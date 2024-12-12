
public class Armstrong {
//Armstrong is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
	    public static void main(String[] args) {

	        int number = 153, originalNumber, remainder , result = 0;
	        originalNumber = number;
	        while(originalNumber != 0)
	        {
	        	remainder = originalNumber%10;
	        	int numDigits = String.valueOf(number).length();  // Calculate number of digits
	        	//converts the number to a string and gets its length, which is the count of digits in the number.
	        	result += Math.pow(remainder, numDigits);  // Raise remainder to the power of numDigits
	        	originalNumber /= 10;
	        }
	        
	        if(result==number)
	        	System.out.println(number+" is an Armstrong Number");
	        else
	        	System.out.println(number+ " is not an Armstrong number");
	    }
}
	        