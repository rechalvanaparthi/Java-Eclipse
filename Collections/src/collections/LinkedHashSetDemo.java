package collections;

import java.util.LinkedHashSet;

/*Linked HashSet:
  1.Insertion Order will be maintained 
  2.Duplicates are not allowed
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.add(100);
		h.add(400);
		h.add(300);
		h.add(200);
		h.add(500);
		System.out.println(h);
		
		h.add(100);
		h.add(200);
		System.out.println(h);
		
	}

}
