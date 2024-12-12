package exceptions;

public class Test {
	public static void main(String[] args) {
		System.out.println("Start");
		int[] arr = {10,20,30};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		String s = null;
		
		try{
			//System.out.println(arr[3]);
			//System.out.println(10/0);
			System.out.println(s.charAt(0));
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No element is present");
		}catch(ArithmeticException e) {
			System.out.println("can't divide by 0");
		}catch(Exception e) {
			//e.printStackTrace();---------->printStackTrace() method prints a detailed report of the method calls that led to the exception
			//System.out.println(e);  -------> exception name followed by description
			System.out.println(e.getMessage());//-------->it prints only the description of the exception
		}
		System.out.println("End");
	}
}
