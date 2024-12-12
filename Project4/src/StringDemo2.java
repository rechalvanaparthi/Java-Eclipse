public class StringDemo2 {
public static void main(String[] args) {
	String s = "Java";
	
	String s2 = s.concat("23");
	
	System.out.println(s2);
	
	System.out.println(s.length());
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.concat("-23"));
	System.out.println(s.substring(2));
	System.out.println(s.charAt(2));
	System.out.println(s.charAt(0));
	}
}