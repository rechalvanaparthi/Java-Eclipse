
public class EmployeeTest {
public static void main(String[] Args) {
	//Object Creation Or Instantiation
	Employee e1= new Employee(1001,"Wills",45000.0);
	
	//For accessing instance props we should have reference variables
	System.out.println(e1.employeeId);
	System.out.println(e1.employeeName);
	System.out.println(e1.employeeSalary);
	
	//Accessing Static props we can use reference variables or class 
	System.out.println(e1.employeeOrganisation);
	
	//Using Class name is recommended
	System.out.println(Employee.employeeOrganisation);
	
	// Accessing Instance Method
	e1.displayDetails();
	
	Employee e2= new Employee(1002,"Smith",46000.0);
	
	System.out.println(e1.hashCode());
	System.out.println(Integer.toHexString(e1.hashCode()));
	
	System.out.println(e1);
	System.out.println(e1.toString());
	
	
	System.out.println(e2.hashCode());
	System.out.println(Integer.toHexString(e2.hashCode()));
	
	System.out.println(e2);
	System.out.println(e2.toString());
	
	
	
	/*output: address of the object - technically called as hash code 
	 * when we print an object reference variable externally 
	 *or by default internally toString is called.
	 */
}
}
