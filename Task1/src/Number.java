
public class Number {
	public static void main(String[] args) {
		int number = 123;
		int sum = 0, reverse = 0, count = 0;

		while (number >= 1) {

		 int digit = number % 10;

		 sum += digit;
		 reverse = reverse * 10 + digit;
         number /= 10;
         count++;

		}

		System.out.println("Sum of digits: " + sum);
		System.out.println("Reverse of the number: " + reverse);
		System.out.println("Number of digits: " + count);

		 }

}
