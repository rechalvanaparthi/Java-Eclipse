
public class Employee {
	//Instance Properties
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	
	//Static Properties
	static String employeeOrganisation="Edubridge";

	//Constructor
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;

}
   // Instance Methods
public void displayDetails() {
	System.out.println("Employee Id:" +employeeId);
	System.out.println("Employee Name:" +employeeName);
	System.out.println("Employee Salary:" +employeeSalary);
	
}
	@Override //anotation
	public String toString() {
		return employeeId+"\t"+employeeName+"\t"+employeeSalary;
	}

}

