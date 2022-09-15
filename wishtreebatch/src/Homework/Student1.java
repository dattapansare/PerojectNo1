package Homework;


import java.util.Scanner;

public class Student1 {
	
	
	
	static String collegeName = "T.C.COLLEGE BARAMATI";
	static float percentage;
	
	static int sId;
	static String sName;
	
	Student1()
	{
		
	}
	
	
	public void percentage() {
		if (percentage > 90 && percentage <= 100) {
			System.out.println("A++");
		} else if (percentage >= 80 && percentage < 90) {
			System.out.println("A+");

		} else if (percentage >= 70 && percentage < 80) {
			System.out.println("B");

		} else if (percentage >= 60 && percentage < 70) {
			System.out.println("C");

		} else if (percentage >= 50 && percentage < 60) {
			System.out.println("D");

		} else if (percentage >= 40 && percentage < 50) {
			System.out.println("student is pass");

		} else {
			System.out.println("student is fail");

		}

	}

	

	public static void collegeAddress() {
		String collegeAddress = "NEAR HIGHWAY";
		System.out.println("college address is :" + collegeAddress);
	}
	
	
	public String toString() {
		return "student id is:" + sId + "student name is:" + sName + "student percentage is:" + percentage
				+ "student college name:" + collegeName;
	}

	
	public static void main(String[] arg) {
		
		
		
		
		
		 Scanner sc = new Scanner(System.in);
		

		System.out.println("enter the id of the student");
		sId = sc.nextInt();
		

		System.out.println("enter the name of the student");
	    sName = sc.next();
	    
	    System.out.println("enter the percentage of the student");
	    percentage=sc.nextFloat();
	    
	    
	    sc.close();
	    
	    

	    
	    
	    
	    
	    
	    

		
		Student1 s = new Student1();
		s.percentage();
		Student1.collegeAddress();
		System.out.println(s);
		System.out.println("coolege name is :" + Student1.collegeName);

	}

}
