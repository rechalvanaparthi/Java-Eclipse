package java8features;

@FunctionalInterface
interface Printer{
	void print();
}
public class MethodReference {
	public static void beginPrintJob()
	{
		System.out.println("print job begins......");
	}
	
	public void startPrintJob()
	{
		System.out.println("start printing job......");
	}
	
	public static void main(String[] args) {
		
		MethodReference m = new MethodReference();
		Printer p3 = ()-> m.startPrintJob();
		p3.print();
		
		//Method Reference with Instance Methods
		Printer p4 = m:: startPrintJob;
		p4.print();
		
		Printer p1 = ()->MethodReference.beginPrintJob();
		p1.print();
		//here lamda is not doing anything just calling the method so it is
		//replaced with method reference(syntax) with static method
		Printer p2 = MethodReference::beginPrintJob;
		p1.print();
	}
}