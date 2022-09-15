package Homework;

public class Student {

	int rollNo;
	String sName;
	static char division = 'A';

	public Student(int rollNo, String sName) {
	
		this.rollNo = rollNo;
		this.sName = sName;
	}

	public void display() {
		System.out.println("rollNo is" + rollNo);
		System.out.println("sName is" + sName);
		System.out.println("Division is" + division);

	}

	static void show() {
		int icardNumber = 101;
		System.out.println("icardNumber=" + icardNumber);

	}

	
}
