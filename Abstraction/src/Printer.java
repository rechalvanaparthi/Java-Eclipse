/*
 * Functional Interface
 * Introduced in Java8
 * */
@FunctionalInterface

// only one abstract method is allowed
public interface Printer {
	void printJob();//implicitly public abstract
	
	
	//Any no of default and static methods are allowed
	default void scan() {
		System.out.println("Scan........................");
	}
	static void threeDPrint() {
		System.out.println("3D Printer....");
	}
}
