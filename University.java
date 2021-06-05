package Classes;
import java.util.ArrayList;

import java.util.List;
import Interface.*;

public class University implements FacultyOperations,StudentOperations {
	Faculty faculties;//reference object of Faculty class.
	Student student;
	List<String> Flist = new ArrayList<String>(100);//Faculty array list.
	List<String> SList=new ArrayList<String>(100);

	public void getFaculty(String fId) {

	}

	public void showAllFaculty() {
		System.out.println("\n Faculties are:" + Flist);
	}

	public void setFaculty(Faculty e) {

		e.setName(e.name);
		e.setfId(Integer.parseInt(e.fid));
		e.setSalary(e.salary);
	}

	public void insertFaculty(Faculty e) {

		setFaculty(e);

		Flist.add(e.getName());
		Flist.add(Integer.toString(e.getFId()));
		Flist.add(Double.toString(e.getSalary()));

		System.out.println("Faculty added sucessfully...");
	}

	public void removeFaculty(Faculty e) {

		int i = 1;

	    while(i<Flist.size()) {
	        System.out.println(Flist.get(i));
	        if(e.fid.equals(Flist.get(i)))
	        {
	            System.out.println("Match found.");
	            Flist.remove(i-1);
	            Flist.remove(i-1);
	            Flist.remove(i-1);
	        }
	        else
	        {
	            i+=3;
	        }
	    }

	}

	
	public void setStudent(Student s) {
		s.setName(s.name);
		s.setSid(s.sid);
	}

	public void getStudent(int sid) {
		
	}

	public void insertStudent(Student s) {
		setStudent(s);

		SList.add(s.getName());
		SList.add(Integer.toString(s.getSid()));
		
		System.out.println("Student added successfully.");
		
	}
	public void removeStudent(Student s) {
		int i = 1;

	    while(i<SList.size()) {
	        System.out.println(SList.get(i));
	        if((Integer.toString(s.sid)).equals(SList.get(i)))
	        {
	            System.out.println("Student removed.");
	            SList.remove(i-1);
	            SList.remove(i-1);
	        }
	        else
	        {
	            i+=2;
	        }
	    }
		
	}

	public void showAllStudents() {
		System.out.println("Student List: "+SList);
		
	}
}
