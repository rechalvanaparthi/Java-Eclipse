package collections;
/*HashMap
 * 1.To store key and value pair
 * 2.stored based on hashcode of key
 * 3.null keys and null values are allowed
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Integer> hm= new HashMap<>();
		hm.put("JFS", 400);
		hm.put("PFS", 400);
		hm.put("MEAN", 250);
		hm.put("MERN", 250);
		System.out.println(hm);
		
		hm.put("JFS", 400);
		System.out.println(hm);
		
		hm.put(null,100);
		System.out.println(hm);
		
		hm.put("Angular",null);
		System.out.println(hm);
		
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		for(Map.Entry<String,Integer> entry:hm.entrySet()){
			System.out.println(entry);
		}
		
	}
}
