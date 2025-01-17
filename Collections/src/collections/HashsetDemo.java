package collections;

import java.util.HashSet;

/*HashSet:
  1.Insertion Order won't be maintained 
  -----> Elements are added based on hashcode of object
  2.Duplicates are not allowed
 */
public class HashsetDemo {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(100);
		h.add(200);
		h.add(300);
		h.add(400);
		h.add(500);
		System.out.println(h);
		
		h.add(100);
		h.add(200);
		System.out.println(h);
		
	}

}
