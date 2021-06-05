package Classes;//This package includes all the classes

import java.util.ArrayList;
import java.util.List;

import Interface.CourseOperations;
public class Student implements CourseOperations {
	protected String name;
	protected int sid;
	Course courses;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setSid(int sid) {
		this.sid=sid;;
	}
	public String getName() {
		return name;
	}
	public int getSid( ) {
		return sid;
	}

	List<String> CList = new ArrayList<String>();
	
	public void setCourse(Course c) {

		c.setCourseNumber(c.courseNumber);
		c.setCredit(c.credit);
	}

	public void insertCourse(Course c) {

		setCourse(c);

		CList.add(Integer.toString(c.getCredit()));
		CList.add(Integer.toString(c.getCourseNumber()));
		

		System.out.println("Course added successfully.");
	}

	public void removeCourse(Course c) {

		
		int i = 1;

	    while(i<CList.size()) {
	        System.out.println(CList.get(i));
	        if((Integer.toString(c.courseNumber)).equals(CList.get(i)))
	        {
	            System.out.println("Course removed.");
	            CList.remove(i-1);
	            CList.remove(i-1);
	        }
	        else
	        {
	            i+=2;
	        }
	    }	
	}

	public Course getCourse(int CourseNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public void showAllCourse() {
		System.out.println("\n Courses are:" + CList);

	}
}
