package com.Array;
/*6)Given an array A[], write a function that segregates even and odd numbers. The functions should put all even numbers first, and then odd numbers

Input  = {12, 34, 45, 9, 8, 90, 3}
Output = {12, 34, 8, 90, 45, 9, 3}*/
import java.util.Arrays;

public class EvenOdd {

	public static void main(String args[]) {
		int[] array = { 12,34,45,9,8,90,3};
		evenOddFunction(array);
		System.out.println(Arrays.toString(array));
	}

	private static void evenOddFunction(int[] data) {
		int leftSide = 0;
		int rightSide = data.length - 1;

		while (rightSide >= leftSide) {
			if (data[leftSide] % 2 != 0 && data[rightSide] % 2 == 0) {
				// swapping as soon as we find even and odd combination
				swappEvenOdd(data, leftSide, rightSide);
				leftSide++;
				rightSide--;
			} else {
				if (data[leftSide] % 2 == 0) {
					leftSide++;
				}
				if (data[rightSide] % 2 == 1) {
					rightSide--;
				}
			}
		}

	}

	private static void swappEvenOdd(int[] data, int left, int right) {
		// swapping even and odd numbers
		int temp = data[left];
		data[left] = data[right];
		data[right] = temp;
	}
}
