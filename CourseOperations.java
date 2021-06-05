package Interface;//this package includes all the interfaces

import Classes.Course;//importing class from classes package

public interface CourseOperations 
{
	public abstract void insertCourse(Course c);
	public abstract void removeCourse(Course c);
	public abstract Course getCourse(int CourseNumber);
	public abstract void showAllCourse();

}
