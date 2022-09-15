package com.Array;

public class DeleteElement {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };

		// 0 1 2 3 4
		// 10 20 30 50

// 10 20 30 50 50
		int index = 1;
		int size = arr.length;
		// i=4 4>3 4--
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];

		}
		size--;// 4

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

	}

}
