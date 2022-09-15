package com.Array;
/*ake 5 integer inputs from user and store them in an array. Now, copy all
the elements in another array but in reverse order.*/

public class ReverseOrder{

	public static void main(String[] args) {

		Integer[] intArray = { 10, 20, 30, 40, 50};

		// print array starting from first element
		System.out.println("Original Array:");
		for (int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + "  ");

		System.out.println();

		// print array starting from last element
		System.out.println("Original Array printed in reverse order:");
		for (int i = intArray.length - 1; i >= 0; i--)
			System.out.print(intArray[i] + "  ");
	}

}
