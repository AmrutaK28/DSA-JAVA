/*
Catergory : Array
Complexity : Easy

Problem Statement: Check if array sorted

I/P - [1,2,3,4,5]
O/P - True

I/P - [5,4,6,7,8]
O/P - False

*/

public class CheckIfArraySorted {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        System.out.println(checkIfSortedBF(arr1));

        int[] arr2 = {5,4,6,7,8};
        System.out.println(checkIfSortedBF(arr2));
    }

    public static boolean checkIfSortedBF(int[] arr){
        /*
        Brute Force - 
        Check if prev is less than Curr
        Time Complexity - O(n)
        */
        int length = arr.length;

        for(int i=0; i<length-1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
}
