import Classes.*;

import java.util.Scanner;

class Start {
    public static void main(String []args){
            int choice = 0,subChoice = 0;

            
			Scanner in = new Scanner( System.in );
            University u = new University();
            while(true){
            	try {
                System.out.println("1. Faculty Management");
                System.out.println("2. Student Management");
                System.out.println("3. Course Transactions");
                System.out.println("4. Exit");
                System.out.println("Enter your choice:");
                choice = in.nextInt();
                in.nextLine();
            	}
                catch(Exception e) {
            		System.out.println("Error occured.Please try again.");
            		break;
            	}
                switch(choice) {
                case 1 :{
                    while(true){
                    	try {
                        System.out.println("\nOptions for Faculty Management:");
                        System.out.println("\n1.Insert New Faculty");
                        System.out.println("\n2.Remove existing Faculty");
                        System.out.println("\n3.Show all Faculty");
                        System.out.println("\n4.Going back");
                        System.out.println("\nEnter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                    	}catch(Exception e) {
                    		System.out.println("Error occured.Please try again.");
                    		break;
                    	}
                        if(subChoice==1){
                        	try {
                            Faculty e = new Faculty();
                            String newFacultyName;
                            String newFacultyId;
                            double newSalary;

                            System.out.println("\nEnter the name of the faculty:");
                            newFacultyName = in.nextLine();
                            System.out.println("\nEnter the Id of the faculty:");
                            newFacultyId = in.nextLine();
                            System.out.println("\nEnter the salary of the faculty:");
                            newSalary = in.nextDouble();
                            
                            e.setName(newFacultyName);
                            e.setfId(Integer.parseInt(newFacultyId));
                            in.nextLine();
                            e.setSalary(newSalary);
                            
                            u.insertFaculty(e);
                        	}catch(Exception e) {
                        		System.out.println("Error occured.Please try again.");
                        		break;
                        	}
                        }
                        else if(subChoice==2){
                        	try {
                            Faculty e = new Faculty();
                            String searchFId;
                            System.out.println("\nEnter the FId of your faculty you want to remove:");
                            searchFId = in.nextLine();
                            int id = Integer.parseInt(searchFId);
                            e.setfId(id);
                            u.removeFaculty(e);
                        	}catch(Exception e) {
                        		System.out.println("Error occured.Please try again.");
                        		break;
                        	}
                        }
                        else if(subChoice==3){
                            u.showAllFaculty();
                        }
                        else if(subChoice==4){
                            break;
                        }
                        
                }
                    break;
                }
                case 2:{
                    while(true){
                    	try {
                        System.out.println("\nOptions for Student Management:");
                        System.out.println("\n1.Insert New Student:");
                        System.out.println("\n2.Remove Existing Student:");
                        System.out.println("\n3.Show All Student:");
                        System.out.println("\n4.Going Back.");
                        System.out.println("\nEnter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                    	}catch(Exception e) {
                    		System.out.println("Error occured.Please try again.");
                    		break;
                    	}
                        if(subChoice==1){
                        	try {
                            Student s = new Student();
                            String newStudentName;
                            int newStudentId;
                            

                            System.out.println("\nEnter the name of the student:");
                            newStudentName = in.nextLine();
                            System.out.println("\nEnter the Id of the student:");
                            newStudentId = in.nextInt();
                            in.nextLine();
                            
                            s.setName(newStudentName);
                            
                            s.setSid(newStudentId);
                            
                            
                            u.insertStudent(s);
                        	}catch(Exception e) {
                        		System.out.println("Error occured.Please try again.");
                        		break;
                        	}
                        }
                        else if(subChoice==2){
                        	try {
                            Student s = new Student();
                            int searchSId;
                            System.out.println("\nEnter the SId of the student you want to remove:");
                            searchSId = in.nextInt();
                            s.setSid(searchSId);
                            u.removeStudent(s);
                        	}catch(Exception e) {
                        		break;
                        	}
                        }
                        else if(subChoice==3){
                            u.showAllStudents();
                        }
                        else if(subChoice==4){
                            break;
                        }
                        
                }
                    break;
                }
                case 3:{
                    while(true){
                    	try {
                        System.out.println("\nOptions for course transactions:");
                        System.out.println("\n1.Adding Course");
                        System.out.println("\n2.Withdraw course");
                        System.out.println("\n3.Going Back");
                        System.out.println("\nEnter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                    	}catch(Exception e) {
                    		System.out.println("Error occured.Please try again.");
                    		break;
                    	}
                        if(subChoice==1){
                        	try {
                            Course c = new Course();
                            FileReadWriteDemo frd=new FileReadWriteDemo();
                            //int NewCourseNumber;
                            //int NewCredit;
                            int qnt;
                            
                            System.out.println("\nEnter the total number of course you want to add:");
                            qnt = in.nextInt();
                            frd.writeInFile(Integer.toString(qnt));

                            in.nextLine();
                            c.adding(qnt);
                            
                        }catch(Exception e) {
                    		System.out.println("Error occured.Please try again.");
                    		break;
                    	}
                            
                        }
                        else if(subChoice==2){
                        	try {
                        	Course c = new Course();
                            FileReadWriteDemo frd=new FileReadWriteDemo();
                            
                            int searchCN;
                            System.out.println("\nHow many courses do you want to remove:");
                            searchCN = in.nextInt();
                            frd.writeInFile(Integer.toString(searchCN));
                            c.dropping(searchCN);
                           
                        	}catch(Exception e) {
                        		System.out.println("Error occured.Please try again.");
                        		break;
                        	}
                        }
                        else if(subChoice==3){
                            break;
                        }
                        
                }
                    break;
                }
                case 4:
                	System.exit(0);
                	break;
                default:
                	System.out.println("Invalid Option.");
                	break;
                }
                	
            
                }
    
            
            
        
        
    }
}