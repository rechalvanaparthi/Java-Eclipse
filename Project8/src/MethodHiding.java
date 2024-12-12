class Parent1{
	public static void study() {
		System.out.println("Medicine");
	}
}
class Child1 extends Parent1{
	public static void study() {
		System.out.println("Acting");
	}
}
public class MethodHiding {
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.study();
		
		Child1 c = new Child1();
		c.study();
		
		Parent1 p2 = new Child1();
		p2.study();
	}
}



