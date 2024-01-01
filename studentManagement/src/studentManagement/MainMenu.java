package studentManagement;

import java.util.Scanner;

public class MainMenu {
	
	public static String Display() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose from the following options:\n");
		
		System.out.println("Search for student by first and last name: search");
		System.out.println("Get the student's ID number: Get ID");
		System.out.println("Display general info: info");
		System.out.println("Add a student to the system: Add");
		System.out.println("If done, enter q");
		String user_input = sc.nextLine();
		
		return user_input;
	}

}
