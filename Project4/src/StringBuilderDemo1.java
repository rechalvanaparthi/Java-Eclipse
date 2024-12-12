/*
StringBuilder is mutable 
Not Thread safe object
 */
public class StringBuilderDemo1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb);
		sb.append("23");
		System.out.println(sb);
}
}
