package exceptions;

public class CheckedExceptionDemo2 {
	public static void main(String[] args){
		System.out.println("Hello");
		try{
			Thread.sleep(5000);//it sleeps for 5000milliseconds i.e 5sec
		}
		catch(InterruptedException e){
			System.out.println("Exception Raised");	
		}
			System.out.println("Java");
	}
}
