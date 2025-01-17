package java8features;

@FunctionalInterface
interface MyFunctionalInterface{
	void greet(String name);
}

@FunctionalInterface
interface MyFunctionalInterface2{
	int findSquare(int num);
}

@FunctionalInterface
interface MyFunctionalInterface3{
	int findsum(int x, int y);
}

@FunctionalInterface
interface MyFunctionalInterface4{
	boolean isEven(int num);
}

public class LambaExpressions {
	public static void main(String[] args) {
		MyFunctionalInterface4 myfun4 = (int num)-> num % 2 == 0;
		//boolean even = myfun4.isEven(3);
		//System.out.println(even); or we can do 
		
		System.out.println(myfun4.isEven(10));
		System.out.println(myfun4.isEven(11));
		
		MyFunctionalInterface3 myfun3 = (int x, int y)-> x+ y;
		int sum = myfun3.findsum(3, 5);
		System.out.println(sum);
		
		MyFunctionalInterface2 myfun2 = (int num) -> num*num;
		int square = myfun2.findSquare(10);
		System.out.println(square);
		
		MyFunctionalInterface myfun = (String name) -> System.out.println("Hello...."+name);
		myfun.greet("Raaj");
	}

}
