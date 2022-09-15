package Homework;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		sc.close();

		/*
		 * remainder = number % 2;
		 * 
		 * if (remainder == 0) { System.out.println("number is even" + number); } else
		 * System.out.println("number is odd" + number);
		 */

		System.out.println("List of even numbers from 1 to " + number);

		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");

			}

		}
		System.out.println("____________________________________________________");

		System.out.println("List of odd numbers from 1 to " + number);

		for (int i = 1; i <= number; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");

			}

		}

	}
}
