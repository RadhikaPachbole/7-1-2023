package com.Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ArrayListExample {
	public static void main(String[] args) {
		List<Student> studlist = new ArrayList<Student>();
		studlist.add(new Student("AF0216223", "Aryan Raj", 21, "Andra Pradhesh"));
		studlist.add(new Student("AF0216224", "Bivor Kumar", 22, "Andra Pradhesh"));
		studlist.add(new Student("AF0216227", "SUSHMITA KUMARI", 23, "Madhya Pradesh"));
		studlist.add(new Student("AF0216231", "Ragiv Zafar", 24, "Maharashtra"));
		studlist.add(new Student("AF0216232", "RAHUL MAHTO", 25, "Orissa"));
		studlist.add(new Student("AF0216234", "Nainsi Kumari", 19, "Gujarath"));
		studlist.add(new Student("AF0216236", "MD ALI", 26, "Madhya Pradesh"));
		studlist.add(new Student("AF0216238", "Abhishek Kumar", 22, "Andra Pradhesh"));
		studlist.add(new Student("AF0216240", "Afroz Ansari", 21, "Maharashtra"));
		studlist.add(new Student("AF0216259", "RITIK RAJ", 20, "Orissa"));
		studlist.add(new Student("AF0216263", "Anant Kumar", 25, "Andra Pradhesh"));
		studlist.add(new Student("AF0216305", "BABU KUMAR", 24, "Gujarath"));
		studlist.add(new Student("AF0216307", "Nikita  KUMARI", 23, "Madhya Pradesh"));
		studlist.add(new Student("AF0216353", "PRANAV PANDEY", 22, "Orissa"));
		studlist.add(new Student("AF0216964", "Radheshyam Kumar", 21, "Maharashtra"));
		studlist.add(new Student("AF0216964", "Ankur Utpal", 19, "Gujarath"));
		studlist.add(new Student("AF0217607", "Banty Mishra", 18, "Madhya Pradesh"));
		studlist.add(new Student("AF0217607", "Riya Kumari", 20, "Karnataka"));
		studlist.add(new Student("AF0217791", "Priyadarshani Kumari", 21, "Maharashtra"));
		studlist.add(new Student("AF0223373", "Chanchal Thakur", 22, "Orissa"));
		studlist.add(new Student("AF0221549", "SATENDRA KUMAR", 23, "Maharashtra"));
		studlist.add(new Student("AF0216212", "Pappi Verma", 24, ""));
		studlist.add(new Student("AF0216244", "Ramkrishna Kushwah", 25, "Andra Pradhesh"));
		studlist.add(new Student("AF0216245", "Yogita Tamoliya", 26, "Orissa"));

		System.out.println("List Of Student Display  : ");
		for (Student s : studlist) {
			System.out.println(s.Studentcode + " " + s.studentname + " " + s.age + " " + s.state);
		}
		System.out.println("  ");
		System.out.println("********************************************");
		System.out.println("  ");
		System.out.println("Find the Student Aged Over 20 :");
		ArrayList<Student> studage = new ArrayList<Student>();
		for (Student s1 : studlist) {
			if (s1.getAge() > 20)
				studage.add(s1);

		}
//   System.out.println(studage);
		for (Student s2 : studage) {
			System.out.println(s2.getStudentname() + " " + s2.getAge());
		}
		System.out.println("  ");
		System.out.println("********************************************");
		System.out.println("  ");
		System.out.println("Student List From Andhra Pradhesh : ");
		ArrayList<Student> studstate = new ArrayList<Student>();
		for(Student s3: studlist)
		{
			if
			(s3.getState().equals("Andra Pradhesh"))
				studstate.add(s3);
		}
		for (Student s4 : studstate) {
			System.out.println(s4.getStudentname() + " " + s4.getState());
		}
		System.out.println("  ");
		System.out.println("********************************************");
		System.out.println("  ");
		System.out.println("Sort The age in the List with Name : ");
		ArrayList<Student> al=new ArrayList<>();
		Collections.sort(studlist);
		for(Student student:studlist) {
			System.out.println(student.getAge()+" || "+student.getStudentname());
		}
		System.out.println("  ");
		System.out.println("********************************************");
		System.out.println("  ");
		System.out.println("Sort The State in the List with Name : ");
		Collections.sort(studlist);
		for(Student stud1:studlist)
		{
			System.out.println(stud1.getState()+" || "+stud1.getStudentname());
		}

	}
}

