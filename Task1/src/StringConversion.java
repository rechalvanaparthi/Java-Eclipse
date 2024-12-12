
public class StringConversion {
	public static void main(String[] args) {
        String input = "RecHaL AxA vAnapaRthI";

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                output += Character.toLowerCase(ch);
            } 
            else{
                output += Character.toUpperCase(ch);
            }
        }

        System.out.println("Output: " + output);
    }
}
