/*
Catergory : Array
Complexity : Easy

Problem Statement: Given an array of N integers, left rotate the array by one place.

I/P - N = 5, array[] = {1,2,3,4,5}
O/P - [2,3,4,5,1]


*/

public class LeftRotateByOne {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n = 5;
        rotateLeftByOneBF(arr, n);
        rotateLeftByOneOptimal(arr, n);
    }

    public static void rotateLeftByOneBF(int[] arr, int n){
        /*
        Brute Force - 
        Create new array and place i+1 from old to new array.
        Time Complexity - O(n)
        Space Complexity - O(n) 
        */

        int arrCopy[] = new int[n];
        for(int i=0; i<n-1; i++){
            arrCopy[i] = arr[i+1];
        }
        arrCopy[n - 1] = arr[0];
        printArray(arrCopy);
    }

    public static void rotateLeftByOneOptimal(int[] arr, int n){
        /*
        Optimal - 
        Store 1st element in variable and then keep shifting the next element with the prev one.
        and lastly restore the last element with stored variable
        Time Complexity - O(n)
        */
        
        int firstElement = arr[0];
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = firstElement;
        
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
