package com.Array;

import java.util.Scanner;

public class Size {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int size = Sc.nextInt();
		int number[] = new int[size];

		// input
		for (int i = 0; i < size; i++) {
			number[i] = Sc.nextInt();
		}

		// output
		for (int i = 0; i < size; i++) {
			System.out.println(number[i]);
		}

	}

}
