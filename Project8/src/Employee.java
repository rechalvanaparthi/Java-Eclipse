/*
 * DTO-data transfer object
 * POJO- plain old java object
 * model
 * 
 */
public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	//setter and getter methods 


	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}