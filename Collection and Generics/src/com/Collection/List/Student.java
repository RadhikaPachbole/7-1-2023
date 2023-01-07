package com.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;


public class Student implements Comparable<Student>{
	 String Studentcode;
	 String studentname;
	 int age;
	 String state;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentcode, String studentname, int age, String state) {
		super();
		this.Studentcode = studentcode;
		this.studentname = studentname;
		this.age = age;
		this.state = state;
	}
	public String getStudentcode() {
		return Studentcode;
	}
	public void setStudentcode(String studentcode) {
		Studentcode = studentcode;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Student [Studentcode=" + Studentcode + ", studentname=" + studentname + ", age=" + age + ", state="
				+ state + "]";
	}
	@Override
	public int compareTo(Student student) {
		if(getAge() == student.getAge())
			return 0;
		else if(getAge() > student.getAge()) 
			return 1;
		else
			return -1;
	}
	public int compareTo1(Student student)
	{
		if(getState().compareTo(student.getState())== 0)
			return getStudentname().compareTo(student.getStudentname());
		else if(getState().compareTo(student.getState()) > 0)
			return getStudentname().compareTo(student.getStudentname());
		else 
			return getStudentname().compareTo(student.getStudentname());
	}
	
}
