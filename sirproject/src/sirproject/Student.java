package sirproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
	private int studentId;
	private String studentName;
	private String studentCourse;
	private double studentCourseFee;
}
