class Parent{
	public final void study() {
		System.out.println("Medicine");
	}
	public void property() {
		System.out.println("100Acre + 100kgs of gold + 100 Crores");
	}
	public void marry() {
		System.out.println("Arrange Marriage");
	}
}
class Child extends Parent{
	//Method Overriding
	@Override
	
	public void marry() {
		System.out.println("Love Marriage");
	}	
}
	public class OverRidingDemo {
	public static void main(String[] args) {
		Parent p= new Parent();
		p.study();
		p.property();
		p.marry();
		System.out.println("..........");
		
		Child c= new Child();
		c.study();
		c.property();
		c.marry();
		
		Parent p2 = new Child();
		p2.marry();
		
	
		
	}

}
