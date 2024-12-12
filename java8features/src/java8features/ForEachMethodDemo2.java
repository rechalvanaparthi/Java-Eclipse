package java8features;

import java.util.Arrays;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ForEachMethodDemo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(44,55,66,77,88,99);
		System.out.println("using for each loop");
		for(int x : list) {
			System.out.println(x);
		}
		
		for(int element : list) {
			if (element % 2 == 0) {
	            System.out.println(element);
	        }
		}

    // Use forEach() method
    list.forEach((element) -> {
    	if (element % 2 == 0) {
            System.out.println(element);
        }
    });
    System.out.println("using filter() method");
    
    Predicate<Integer> predicate = (element) -> element%2 ==0;
    
    list.stream()
     	.filter(predicate)
    	.forEach(System.out :: println);
    
    System.out.println("using filter() method using Stream API");
    list.stream()
 	.filter((element) -> element%2 ==0)//predicate as argument and expression should be boolean. based on the return type we need to write the condition
	.forEach(System.out :: println);
    
    List<Integer> salaries = Arrays.asList(40000,50000,60000,70000,80000,90000);
    //System.out.println("using for each loop");
    System.out.println("Original Salaries:");
    salaries.forEach(System.out::println);//prints the original list.

    //System.out.println("\nUpdated Salaries:");
    List<Integer> incrementedSalaries = salaries.stream()
            .map(salary -> salary + 5000)  // Increment each salary by 5000,function as a argument- apply method
            .collect(Collectors.toList());  // Collect results into a new list

    System.out.println("\nUpdated Salaries:");
    incrementedSalaries.forEach(System.out::println);
    
    List<Double> incrsalaries = salaries.stream()
    		.map((salary) -> salary +salary *.1)
    		.toList();
    System.out.println(incrsalaries);
    
    //display total existing salary 
    List<Integer> totalsalaries = salaries.stream()
    		//.reduce(null);
    		.map(salary -> salary + salary)
    		.toList();
    System.out.println(totalsalaries);
 
    
		}

    
    }
// another method which sir told
//List<Integer> incrementedSalaries = new ArrayList();
//Function<integer, integer> fun = (salary)->salary+5000;;
//incrementedSalaries = salaries.stream();
								//.map(fun);//map(Function<T, R> mapper) is a method in the Stream API that applies a mapping function to each element of a stream.
								//.toList();
//system.out.println(incrementedSalaries);

	
	//we have a file and that file contains some data write a program that reads(file) the number of lines, words, characters.
