package sirproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private String employeeEmail;
	
	
}