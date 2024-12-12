package sirproject;

import java.util.Arrays;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student(101,"Wills","JFS",2000),
				new Student(102,"Smith","JFS",1500),
				new Student(103,"Jones","PFS",3000),
				new Student(104,"Alice","PFS",1400),
				new Student(105,"Alex","JFS",2500)
				
				);
		System.out.println("..........All Students...........");
		students.forEach(System.out :: println);
		
		System.out.println("........JFS Students List...........");
		students.stream()
		.filter(student -> student.getStudentCourse().equals("JFS"))
		.forEach(System.out :: println);
		
		System.out.println("........Total fee...........");
		double total = students.stream()
				.filter(student -> student.getStudentCourse().equals("JFS"))
				.mapToDouble(student -> student.getStudentCourseFee())
				.sum();
			System.out.println(total);
	}
}
