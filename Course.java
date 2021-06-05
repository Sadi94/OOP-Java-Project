package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Interface.CourseTransactions;

public class Course implements CourseTransactions {
	int courseNumber;
	int credit;
	int qnt;
	String element;
	List<String> CAddingList = new ArrayList<String>();
	Scanner input = new Scanner(System.in);
	
	public void setCourseNumber(int courseNumber) {
		this.courseNumber=courseNumber;
	}

	public void setCredit(int credit) {
		this.credit=credit;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public int getCredit() {
		return credit;
	}

	public void showInfo() {
		System.out.println("Course Number: " + getCourseNumber());
		System.out.println("Credit: " + getCredit());
	}

	
	public void adding(int quantity) {

		    for (int i = 0; i < quantity; i++) {
		        System.out.print("Insert Course: ");
		        element = input.next();
		        CAddingList.add(element);
		    }
		    System.out.println();
		    System.out.println("Course added successfully\n\n");
		    for (int i = 0; i < CAddingList.size(); i++) {
		        System.out.println(CAddingList.get(i));
		    }
		
	}
	public void dropping(int quantity) {
		int i = 0;
		String CName;
		
	    for(int j=0;j<quantity;j++)
	    {
	    while(i<CAddingList.size()) {
	    	System.out.print("Insert the name of the course you want to drop: ");
		    CName = input.next();
	        System.out.println(CAddingList.get(i));
	        if((CName.equals(CAddingList.get(i))))
	        {
	            System.out.println("Course dropped.");
	            CAddingList.remove(i);
	            
	        }
	        else
	        {
	            i++;
	        }
	    }	
	    	for (int k = 0; k < CAddingList.size(); i++) {
		        System.out.println(CAddingList.get(i));
		    }
	    }
	}

}

