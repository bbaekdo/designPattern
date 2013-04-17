package org.demo;

import org.controller.StudentController;
import org.model.Student;
import org.view.StudentView;

public class MvcPatternDemo {
	
	public static void main(String[] args) {
		Student student = retriveStudentFromDatabase();
		StudentView studentView = new StudentView();
		StudentController studentController = new StudentController(student, studentView);
		studentController.updateView();
		studentController.setStudentId("456");
		studentController.updateView();
		
	}
	
	public static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Paul");
		student.setsId("123");
		return student;
		
	}
}