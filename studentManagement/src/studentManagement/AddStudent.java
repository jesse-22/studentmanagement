package studentManagement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AddStudent {
	String name;
	String DOB;
	int student_ID;
	static List<String> names = new ArrayList<String>(); // Array to store the names of students
	static List<Integer> myListStudentID = new ArrayList<Integer>(); // Array to store the different student ID numbers 
	Random rand = new Random();
	
	public AddStudent(String name) {
		this.name = name;
		names.add(name);
	}
	
	// Add a student to the system
	public void addStudent(String name) {
		names.add(name);
	}
	
	// Generate a random student ID number 
	public int generateStudentID() {
		int student_id = rand.nextInt(100000000);
		this.student_ID = student_id;
		myListStudentID.add(student_id);
		return this.student_ID;
	}

	// Get the first and last name of the student 
	public String getNameOfStudent() {
		return name;
	}
	
	// Get DOB for student
	public String getStudentDOB() {
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
		System.out.print("Enter a date (dd/mm/yyyy): "); 
		String dateStr = sc.next(); 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDate date = LocalDate.parse(dateStr, formatter);
		DOB = date.toString();
		sc.close();
		return DOB;
	}
	
	//Display general info of the student 
	public void DisplayGeneraInfo(AddStudent student) {
		System.out.println("Student's Name: " + this.name);
//		System.out.println("Student's DOB: " + this.DOB);
		System.out.println("Student's ID #: " + this.student_ID);
	}
	
	// Search the student by first and last name
	public void getStudentByID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to search the student by ID number?");
		int id = sc.nextInt();
		sc.close();
		if (myListStudentID.contains(id)) {
			System.out.println("Student is: " + this.name);
			return;
		}
		else {
			System.out.println("Student not found");
			return;
		}
	}
	
	// Search the student by first and last name
	public static void searchStudentByName(AddStudent student) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Search student by name:");
		String nametosearch = sc.nextLine();
		sc.close();
		if (names.contains(nametosearch)) {
			student.DisplayGeneraInfo(student);
		}
		
		else {
			System.out.println("Student not found");
		}
	}

	
	// Main function of class
	public static void main(String[] args) {
		AddStudent student = new AddStudent("John Doe");
		student.generateStudentID();
		searchStudentByName(student);
//		student.getStudentDOB();
//		student.DisplayGeneraInfo(student);
//		student.getStudentByID();
	}
}
