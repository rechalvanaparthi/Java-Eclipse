
public class InterfaceDemo {
public static void main(String[] args) {
	//Instantiation is not possible for interface
	//Calc c= new Calc ----> that is we can't create the object in interface
	
	MyCalc myCalc = new MyCalc();
	System.out.println(myCalc.sum(10,5));
	System.out.println(myCalc.sub(10,5));
	System.out.println(myCalc.mul(10,5));
	System.out.println(myCalc.div(10,5));
	
	// accessing default methods using Implementation Class
	System.out.println(myCalc.findSquare(10));
	System.out.println(myCalc.findCube(10));
	
	
	//static methods cannot be accessed using Implementation Class 
	//System.out.println(myCalc.doubleIt(10));
	
	//static methods can be accessed using Interface Name
	System.out.println(Calc.doubleIt(10));
	
	//Accessing interface variable - PI_VALUE by Implementation Class and Interface Name 
	System.out.println(myCalc.PI_VALUE);
	System.out.println(Calc.PI_VALUE);
	
	
	
	System.out.println("...............");
	
	//Interface can be used as Reference type
	
	Calc c= new MyCalc();
	System.out.println(c.sum(10,5));
	System.out.println(c.sub(10,5));
	System.out.println(c.mul(10,5));
	System.out.println(c.div(10,5));
	
}
}
