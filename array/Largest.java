/*
Catergory : Array
Complexity : Easy

Problem Statement: Find the largest element in an array.

I/P - [3,3,6,1]
O/P - 6

I/P - [3,3,0,99,-40]
O/P - 99

*/

public class Largest {
    public static void main(String[] args){
        int[] arr1 = {3,3,6,1};
        System.out.println(findLargestBF(arr1));
        System.out.println(findLargestBetter(arr1));

        int[] arr2 = {3,3,0,99,-40};
        System.out.println(findLargestBF(arr2));
        System.out.println(findLargestBetter(arr2));
    }

    public static int findLargestBF(int[] arr){
        /*
        Brute Force Approach - 
        Loop through the array and compare each no with every other no.
        Time Complexity - O(n^2)
        */
        int length = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < length; i++){
            largest = arr[i];
            for(int j = 0; j< length; j++){
                if(arr[j] > arr[i]){
                    largest = arr[j];
                }
            }
        }
        return largest;
    }

    public static int findLargestBetter(int[] arr){
        /*
        Better & Optimal Approach - 
        Have a Max pointer and loop through array and keep updating he max pointer 
        if any other no is greater than current max.
        Time Complexity - O(n)
        */
        int length = arr.length;
        int max = arr[0];
        for(int i=1; i<length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
