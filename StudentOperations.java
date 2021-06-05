package Interface;

import Classes.Student;

public interface StudentOperations {
	public abstract void setStudent(Student s);
	public abstract void getStudent(int sid);
	public abstract void insertStudent(Student s);
	public abstract void removeStudent(Student s);
	public abstract void showAllStudents();
}
