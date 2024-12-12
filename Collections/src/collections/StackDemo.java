package collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		System.out.println(s.isEmpty());//to check whether stack is empty or not
		
		s.push("Java");
		s.push("Python");
		s.push("JS");
		s.push("Angular");
		s.push("React");
		System.out.println(s);
		
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());//return the value which is at the top of the stack
		System.out.println(s);
		
		System.out.println(s.isEmpty());
		
	}
}
