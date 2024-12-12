
public class MethodsDemo {

	public static int findsum(int x, int y) {
		return x + y;
	}
	public static void greet(){
		System.out.println("Hello!");
	}
	public static double findMax(double x, double y) {
		return(x > y) ? x : y ;
	}
	public static void main(String[] args) {
		int total = findsum(10,20);
		System.out.println(total);
		
		System.out.println(findsum(200,300));
		System.out.println(findsum(2000,3000));
		
		greet();
		
		double max = findMax(125.4,13);
		System.out.println(max);
	}
}
	