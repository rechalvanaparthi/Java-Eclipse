package exceptions;

public class FinallyDemo {
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
			System.out.println(10/0);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("can't divide by 0");
		}
		finally {
			//the code that need to be executed for sure then we keep that in finally block withrespect of with or without exception
		System.out.println("Mandatory");
		}
		System.out.println("End");
	}
}
