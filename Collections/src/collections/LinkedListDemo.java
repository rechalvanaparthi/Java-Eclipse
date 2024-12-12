package collections;


import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		//Normal LinkedList
	LinkedList a1 = new LinkedList();
	//adding
	a1.add(100);
	a1.add(200);
	a1.add("Java");
	a1.add("Python");
	a1.add(45000.0);
	a1.add(35000.0);
	System.out.println(a1);
	Object obj = a1.get(0);
	int x = (int) obj;
	System.out.println(x);
	
	//Generic Version of ArrayList  ---------> Type safety and avoids type casting
	LinkedList<Integer> subjectMarks = new LinkedList<Integer>();
	subjectMarks.add(44);
	subjectMarks.add(55);
	subjectMarks.add(66);
	subjectMarks.add(77);
	subjectMarks.add(88);
	subjectMarks.add(99);
	System.out.println(subjectMarks);
	
	int s1 = subjectMarks.get(0);
	System.out.println(s1);
	
	LinkedList<String> courseNames = new LinkedList<String>();
	courseNames.add("Java");
	courseNames.add("Python");
	courseNames.add("Angular");
	courseNames.add("ReactJS");
	courseNames.add("JS");
	System.out.println(courseNames);
	
	String c1 = courseNames.get(0);
	System.out.println(c1);
	}
}