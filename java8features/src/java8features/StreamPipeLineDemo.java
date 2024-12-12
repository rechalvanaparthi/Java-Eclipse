package java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamPipeLineDemo {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(50000,40000,20000,30000,60000);
		System.out.println(salaries);
		/*task 1:-
		 * first filter the salary which is more than the 50000
		 * increment the salary by 10%
		 * find the total increment salary 
		 */
		double totalSalary = salaries.stream()
	 	.filter((salary) -> salary >= 50000)//predicate as argument and expression should be boolean. based on the return type we need to write the condition
	 	.mapToDouble((salary) -> salary)
	 	.map(salary -> salary + salary* 1.10)
	 	.sum();
		System.out.println(totalSalary);
		/*task 2:-
		 * first filter the salary which is less than the 50000
		 * show it in descending order
		 */
		
		List<Integer> incrementSalary1 = salaries.stream() //source
			 	.filter((salary) -> salary <= 50000) //Intermediate operation-1
			 	.sorted(Comparator.reverseOrder())//intermediate operation-2 
			 	.toList();
		System.out.println(incrementSalary1);
		/*task 3:-
		 * array list is (1,3,2,4,3,1,2)
		 * remove the duplicates means repeated
		 * sort it in descending order
		 */
		
		
		List<Integer> number = Arrays.asList(1,3,2,4,3,1,2);
		System.out.println(number);
		
		List<Integer> num1 = number.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.toList();
		System.out.println(num1);
		
		/*Task 4:
		Input: JAVA 
		Output: J A V A
		*/

		
			String word = "JAVA";
		System.out.println(word);
		
		String word1 = word.chars()//Converts the string word into an IntStream of Unicode values (ASCII codes).
				.mapToObj(c -> String.valueOf((char) c))  // Convert to Stream<String>Converts each integer c back to its corresponding character using (char) c.
				                                          //String.valueOf((char) c) converts the character to a string.
                .collect(Collectors.joining(" "));//Collects all strings from the stream and joins them with a space " " as a delimiter.
		System.out.println(word1);
		
		
		List<String> string  = Arrays.asList("ja va", "py thon", "an gu lar");

        // Process the list using Streams
        List<String> result = string.stream()
                .map(str -> str.replaceAll("\\s+", ""))  // Remove all spaces
                .map(String::toUpperCase)                 // Convert to uppercase
                .toList();            // Collect into a new list
        System.out.println(result);
		
		
		/*J -> 74
		A -> 65
		V -> 86
		A -> 65*/
	
				
		   /*
				Task 5:
				Input: ["ja va", "py thon", "an gu lar"] 
				Output: ["JAVA","PYTHON","ANGULAR"]
				and convert to upper case
				*/
		
			
		

	}

}