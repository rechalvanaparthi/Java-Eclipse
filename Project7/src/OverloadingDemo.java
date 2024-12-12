class MyCalc{
	public static int findMax(int x, int y) { //static methods are called by using its class name in another class name
		return (x>y) ? x:y;
	}
	public static double findMax(double x, double y) { 
		return (x>y) ? x:y;
	}
	public static long findMax(long x, long y) { 
		return (x>y) ? x:y;
	}
	//VarArg method or Variable Length Argument Method
	public static void m1(int...num) {
		//System.out.println("JAVA");
		int total = 0;
		for(int element: num) {
			total += element;
		}
		System.out.println(total);
		
	}
}
	public class OverloadingDemo {
	public static void main(String[] args) {
		int maxInt = MyCalc.findMax(100,200);
		System.out.println(maxInt);
		
		double maxDouble = MyCalc.findMax(10.5,20.5);
		System.out.println(maxDouble);
		
		long maxLong = MyCalc.findMax(9988776655L,88776655L);
		System.out.println(maxLong);
		
		MyCalc.m1();
		MyCalc.m1(10);
		MyCalc.m1(10,20);
		MyCalc.m1(10,20,30);
		MyCalc.m1(10,20,30,40);
		MyCalc.m1(new int[] {10,20,30,40,50});
		
	}

}
