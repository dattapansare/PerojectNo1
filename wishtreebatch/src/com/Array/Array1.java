package com.Array;

public class Array1 {
	public static void main(String[] args) {
		int arr[] = {4, 6, 5, -10, 8, 5, 20};
		
		int number = 10;
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++){
		    for(int j = i+1; j<arr.length;j++){
		        sum = arr[i] + arr[j];
		        
		        if(sum == number){
		            System.out.println(arr[i]+ "+" +arr[j]+ " = 10");
		        }
		    }
		}
	}

}
