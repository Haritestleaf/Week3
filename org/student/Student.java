package org.student;


import org.department.Department;

public class Student extends Department  {
	public void StudentName() {
		System.out.println("Student Name is Hariharan");
			}
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.StudentName();
	}
} 
