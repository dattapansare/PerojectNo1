package com.Array;

//  WAP to print the alternate values from an array.
public class AlternativeValues {

	// Function to print
	// Alternate elements
	// of the given array
	static void printAlter(int[] arr, int N) {

		// Print elements
		// at odd positions
		for (int currIndex = 0; 
				 currIndex < N; 
				 currIndex += 2) {

			// Print elements of array
			System.out.print(arr[currIndex] + " ");
		}
	}

	// Driver Code
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int N = arr.length;

		printAlter(arr, N);
	}

}
