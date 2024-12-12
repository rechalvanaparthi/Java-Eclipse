
	class Parent2 {
		int a = 10;
		int b = 20;
		int i = 111;
		
		public Parent2() {
			this(10);
			System.out.println("0-Parent constructor");
		}
		public Parent2(int a) {
			this(10,20);
			System.out.println("1-Parent constructor");
		}
		public Parent2(int a, int b) {
			System.out.println("2-Parent constructor");
		}
		
		public void m1() {
			System.out.println("Java");
		}
	}
	class Child2 extends Parent2 {
		int a = 100;
		int b = 200;
		int j = 222;
		
		public Child2() {
			super();//Parent class 0-arg constructor
			//super(10);//Parent class 1-arg constructor
			//super(10,20);//Parent class 2-arg constructor
			System.out.println("0-Child constructor");
		}
		
		public void m1() {
			System.out.println("Python");
		}
		
		public void m2() {
			this.m1();
			super.m1();
		}
		
		void add(int a, int b) {
			System.out.println(a + b);
			System.out.println(this.a + this.b);
			System.out.println(super.a + super.b);
			System.out.println(super.i);
			System.out.println(i);
			System.out.println(this.j);
			System.out.println(j);
		}
	}
	public class Arguments{
		public static void main(String[] args) {
			Child2 c = new Child2();
			c.add(1000, 2000);
			c.m2();
		}
	}

