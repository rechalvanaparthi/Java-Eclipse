
public class CollectionsDemo1 {
public static void main(String[] args) {
	
	// HETEROGENEOUS ELEMENTS
	Object[] objArray = {10,"Jones",45000.0,true};
	int element1 = (int) objArray[0];
	String element2 = (String) objArray[1];
	double element3 = (double) objArray[2];
	boolean element4 = (boolean) objArray[3];
	System.out.println(element1);
	System.out.println(element2);
	System.out.println(element3);
	System.out.println(element4);
}
}
