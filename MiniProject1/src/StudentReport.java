
public class StudentReport {

	    public static void main(String[] args) {

	        // Student details
	        String studentName = "VANAPARTHI RECHAL AXA";
	        String grade = "10th";
	        String medium = "English";
	        int rollNumber = 1821139947;
	        String studentFatherName = "VANAPARTHI VEERAIAH";
	        String studentMotherName = "VANAPARTHI SANDHYA RANI";
	        String schoolName = "Navketan Model School";
	        String dateofbirth = "23-07-2003";
	        

	        // Subject-wise marks
	        int teluguMarks = 85;
	        int hindiMarks = 83;
	        int englishMarks = 88;
	        int mathsMarks = 89;
	        int scienceMarks = 81;
	        int socialStudiesMarks = 78;

	        //calculating totalmarks, percentage and cgpa
	        int totalMarks = teluguMarks + hindiMarks + englishMarks + mathsMarks + scienceMarks + socialStudiesMarks;
	        double percentage = (double) totalMarks / 6;
	        double cgpa = (double) percentage / 9.5;

	        //printing all the details of student
	        System.out.println("........Student Progress Report........");
	        System.out.println("                                ");
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Grade: " + grade);
	        System.out.println("Medium: " + medium);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Student Father Name: " + studentFatherName);
	        System.out.println("Student Mother Name: " + studentMotherName);
	        System.out.println("School Name: " + schoolName);
	        System.out.println("Date of Birth: " + dateofbirth);
	        System.out.println("                                ");
	        System.out.println("\tSubject\t\tMarks");
	        System.out.println("    -----------------------------    ");
	        System.out.println("\tTelugu\t\t" + teluguMarks);
	        System.out.println("\tHindi\t\t" + hindiMarks);
	        System.out.println("\tEnglish\t\t" + englishMarks);
	        System.out.println("\tMaths\t\t" + mathsMarks);
	        System.out.println("\tScience\t\t" + scienceMarks);
	        System.out.println("\tSocial Studies\t" + socialStudiesMarks);
	        System.out.println("                                 ");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Percentage:" + percentage);
	        System.out.println("CGPA:" + cgpa);
	    }

}
