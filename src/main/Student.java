package main;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int yearLevel;
	private String yearSuffix;
	private String studentId;
	private static int baseId = 100000; //static as we want this value to stay within the class, student year level will be concatinated before these
	private int balance;
	private String courses = null;	
	private static int courseCost =600; //static as we want this value to stay within the class, thsi cost is true for all course objects

	//constructor for student name and year
	public Student () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student's first name");
		this.firstName = sc.next(); 
		System.out.println("Enter student's last name");
		this.lastName = sc.next(); 
		System.out.println("Enter student's year level (numerical digits only)");
		this.yearLevel = sc.nextInt(); 
		
		if(yearLevel == 1) {
			this.yearSuffix ="st";
		}
		else if (yearLevel == 2) {
			this.yearSuffix = "nd";
		}
		else if (yearLevel == 3) {
			this.yearSuffix = "rd";
		}
		else {
			this.yearSuffix = "th";
		}
		firstName.toUpperCase();
		lastName.toUpperCase();
		
		setStudentID();
		System.out.println(firstName + " " + lastName + ": " + yearLevel + yearSuffix + " year" + ", " + studentId);
		
		
		
	}
	
	//ID generator
	private void setStudentID() {
		//grade level + id
		baseId++; 	//each time a new student is created, ID number should be incremented
		this.studentId = yearLevel + ""+  baseId; //the empty "" turns this whole statement into a string
	}
	
	//enroll in courses
	public void enroll() {
		System.out.println("Enter course to enroll (x to quit)");
		Scanner sc = new Scanner(System.in);
		String course = sc.next();
		if (course != "x") {
			 courses = courses + "\n" + course;
			 balance = balance + courseCost;
		}
		
		System.out.println("ENROLLED IN:" + courses);
		System.out.println("TUITION BALANCE: $" + balance);
	}

	
	//view balance
	
	//pay tuition
	
	//shot student status
}
