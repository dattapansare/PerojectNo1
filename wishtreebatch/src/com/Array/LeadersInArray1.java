package com.Array;

public class LeadersInArray1{

    /*Java Function to print leaders in an array */
    void printLeaders(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }
 
    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        LeadersInArray1 lead = new LeadersInArray1();
        int arr[] = new int[]{92,7,12,9,8,3};
        int n = arr.length;
        lead.printLeaders(arr, n);


}
}