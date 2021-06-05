package Interface;

import Classes.Faculty;

public interface FacultyOperations {
	public abstract void setFaculty(Faculty e);
	public abstract void getFaculty(String fid);
	public abstract void insertFaculty(Faculty e);
	public abstract void removeFaculty(Faculty e);
	public abstract void showAllFaculty();

}
