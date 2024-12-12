package collections;

import java.util.ArrayDeque;
public class ArrayDequeDemo {

		public static void main(String[] args) {
			ArrayDeque<Integer> d = new ArrayDeque<Integer>();
			d.offer(10);
			d.offerFirst(100);
			d.offerFirst(200);
			d.offerFirst(300);
			
			System.out.println(d);
			d.offer(5);
			d.offerLast(40);
			d.offerLast(20);
			d.offerLast(30);
			System.out.println(d);
			
			System.out.println(d.peek());
			System.out.println(d.peekFirst());
			System.out.println(d.peekLast());
			
			System.out.println(d.poll());
			System.out.println(d.pollFirst());
			System.out.println(d.pollLast());
			System.out.println(d);
		}
}
