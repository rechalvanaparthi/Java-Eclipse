/*
 * Array Definition: To represent a group of fixed size if of similar type data elements
 */
public class ArrayDemo1 {
public static void main(String[] args) {
	//   1.Array Declaration
	int[] arr1;//recommended
	int []arr2;
	int arr3[];
	//int[10] arr4; we should not give the value in the declaration it gives an error - CE
	
	//   2.Array Creation
	arr1 = new int[10];
	//arr2 = new int[];  size is mandatory - CE
	//arr3 = new int[-10]; - RE
	arr2 = new int[0];
	
	//    3.Array Initialization
	arr1[0]=44;
	arr1[1]=55;
	arr1[2]=66;
	
	//4. Access Array Elements
	System.out.println(arr1[0]);
	System.out.println(arr1[1]);
	System.out.println(arr1[2]);
	System.out.println(arr1[3]);
	System.out.println(arr1[9]);
	System.out.println(arr1[0]);//RE
	
	//Array Declaration, Creation and Initialization at a time
	int[] arr4 = new int[] {44,55,66,77,88,99};
	int[] arr5 = {44,55,66,77,88,99};
	
	//find size of array
	System.out.println(arr4.length);// we shouldn't call the array by giving method it gives an error length()x
	
		//Array Traversal
	double[] salaries = {55000.0,45000.0,35000.0,25000.0};
	System.out.println("using for loop");
	int size = salaries.length;
	for(int index = 0; index < size; index++) {
		System.out.println(salaries[index]);
	}
	
	System.out.println("using for each loop");// used for traversing around elements
	for(double salary : salaries) {
		System.out.println(salary);
	}
	/*                          TASK
	 * 1.Store the following employees names Wills, Smith, Jones, Alex, Anna
	 * Display each employee using for loop and for each loop    
	 */
	String[] employees = {"Wills", "Smith", "Jones", "Alex", "Anna"};
	System.out.println("using for loop");
	int length = employees.length;
	for(int index=0; index < length; index++) {
		System.out.println(employees[index]);
		}
	
	System.out.println("using for each loop");
	for(String names : employees) {
		System.out.println(names);
	}
	
	int[] subjectMarks = {55,44,99,77,88,66};
	//Total Subject Marks
	//Average Subject Marks
	 int totalmarks=0;
	 for(int marks : subjectMarks) {
		 totalmarks += marks;
	 }
	 System.out.println("Total Marks:" +totalmarks);
	 System.out.println("Average Marks:" +totalmarks/subjectMarks.length);
	// minimum element in an array
	 int min = subjectMarks[0];
	 for(int marks : subjectMarks) {
	 if(min > marks) {
	 min = marks;
	 }
	 }
	 System.out.println("Minimum marks : "+min);

	 // maximum element in an array
	 int max = subjectMarks[0];
	 for(int marks : subjectMarks) {
	 if(max < marks) {
	 max = marks;
	 }
	 }
	 System.out.println("Maximum marks = "+max);
	 
	 // searching an element
	 int search = 55;
	 for(int i=0; i<subjectMarks.length; i++) {
	 if(subjectMarks[i] == search) {
	 System.out.println("Element found at "+i);
	 //System.exit(0);
	 }
	 }
	 System.out.println("Element not found");
	
}
	
}

