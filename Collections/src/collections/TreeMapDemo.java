package collections;
/*TreeMap
 * To store key and value pair
 * insertion order is maintained based on the keys
 * Null key is not allowed but null values are allowed
 */
import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String,Integer> hm= new TreeMap<>();
		hm.put("JFS", 400);
		hm.put("PFS", 400);
		hm.put("MEAN", 250);
		hm.put("MERN", 250);
		System.out.println(hm);
		
		hm.put("JFS", 400);
		System.out.println(hm);
		
		
		hm.put("Angular",null);
		System.out.println(hm);
		
		//null key is not allowed leads to NPE
		//hm.put(null,100);
		//System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		for(Map.Entry<String,Integer> entry:hm.entrySet()){
			System.out.println(entry);
		}
		
	}
}
