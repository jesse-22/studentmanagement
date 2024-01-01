package studentManagement;

public class DeleteStudent {
	
	String nameToDelete;
	
	public DeleteStudent(String name) {
		name = this.nameToDelete;	
	}
	
	// Delete Student by first and last name
	public static void deleteStudentByName(String name) {
		if (AddStudent.names.contains(name)){
			AddStudent.names.remove(name);
			System.out.println(AddStudent.names);
		}
	}
}
	
