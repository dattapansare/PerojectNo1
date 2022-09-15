package Homework;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {

		System.out.println("enter a number");
		Scanner Sc = new Scanner(System.in);
		int num = Sc.nextInt();

		if (num %2==0) {
			System.out.println("number is even");
		} else
			System.out.println("number is odd");

	}

}
