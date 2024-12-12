package sirproject;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Wills",55000,"wills@gmail.com");
		System.out.println(e1);
		
		
		Employee e3 = new Employee();
		e3.setEmployeeId(101);
		e3.setEmployeeName("Jones");
		e3.setEmployeeSalary(55000);
		e3.setEmployeeEmail("jones@gmail.com");
		
		System.out.println(e3.getEmployeeId());
		System.out.println(e3.getEmployeeName());
		System.out.println(e3.getEmployeeSalary());
		System.out.println(e3.getEmployeeEmail());
	}
}
