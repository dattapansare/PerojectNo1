package com.Array;

public class Merge {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 5, 6, 7 };
		int length = arr1.length + arr2.length;
		int arr3[] = new int[length];
		int i;

		for (i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int j = i, k = 0; j < arr3.length && k < arr2.length; j++, k++)

		{
			arr3[j] = arr2[k];
		}

		for (i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}

}
