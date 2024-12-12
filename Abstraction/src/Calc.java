//initialization should be done in interface and no body is taken
public interface Calc {
	public static final double PI_VALUE = 3.14;// interfaces are by default public static final variables
	public abstract int sum(int x, int y);//interfaces are by default abstract methods
 	int sub(int x, int y);
 	int mul(int x, int y);
 	int div(int x, int y);

 	//from java 8
 	
 	public default int findSquare(int x){
 		return x*x;
 	}
 	public default int findCube(int x){
 		return x*x*x;
 	}
 	
 	//static methods
 	public static int doubleIt(int x) {
 		return x+x;
 	}
}
