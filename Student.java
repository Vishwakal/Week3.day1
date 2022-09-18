package org.student;

import org.Department.Department;

public class Student extends Department{
	public static void main(String[]args) {
		Department d =new Department();
		d.Collegecode();
		d.Collegename();
		d.CollegeRank();
		d.department();
		Student s= new Student();
		s.StudentName();
		s.StudentId();
		s.StudentDepartment();
	}
	
	public void StudentName() {
		System.out.println("vishwa");
		
	}
	public void StudentDepartment() {
		System.out.println("IT");
	}
	
	public void StudentId() {
		System.out.println("17Mca067");
	}
     

	
}
