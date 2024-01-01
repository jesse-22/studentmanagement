package studentManagement;

import java.util.Scanner;

public class Main {
	
	static String user_input;
	static String name;
	
	// Main function
	public static void main(String[] args) {
		while (true) {
			// Create new student objects
			AddStudent student  = new AddStudent("John Doe");
			student.generateStudentID();
			
			// Display the main menu  
			System.out.println("Student Management System");
			user_input = MainMenu.Display();
			
			// Search for student by name
			if (user_input.toLowerCase().contentEquals("search")) {
				AddStudent.searchStudentByName(student);
			}
			
			// Add a new student to the system
			if (user_input.contentEquals("Add")){
				System.out.println("Enter Student's name: ");
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				name = sc.nextLine();
				student.addStudent(name);
			}
			
			if (user_input.contentEquals("info")) {
				student.DisplayGeneraInfo(student);
			}
			
			// Quit the program
			if (user_input.contentEquals("q")) {
				System.out.println("Program Exited");
				return;
			}
		}
	}
}
