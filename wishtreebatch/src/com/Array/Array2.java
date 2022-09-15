package com.Array;

public class Array2 {
	

    public static boolean isPresent(int number){
        int digit = number%10;
        if(digit == 9){
            return true;
        }
        return false;
    }
    
	public static void main(String[] args) {
		int arr[] = {72, 69, 76, 76, 79};
		
		for(int i=0;i<arr.length;i++){
		    if(isPresent(arr[i])){
		        arr[i] = 0;
		    }
		}
		
		// Only for printing the array
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}


