/*
Catergory : Array
Complexity : Easy

Problem Statement: Remove Duplicates from sorted array

I/P - [1,1,2,2,2,3,3]
O/P - [1,2,3]


*/
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,3};
        int size = removeDuplicatesBF(arr);
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
        int[] arr2 = {1,1,2,2,2,3,3};
        int size2 = removeDuplicatesOptimal(arr2);
        for(int i=0; i<size2; i++){
            System.out.print(arr2[i] + " ");
        }

    }


    public static int removeDuplicatesBF(int[] arr){
        /*
        Brute Force - 
        Insert array in hash set and get size from hash and populate the array again
        Time Complexity - O(n*log(n))+O(n)
        Space Complexity - O(n)
        */

        int length = arr.length;
        HashSet <Integer> set = new HashSet<Integer>();
        for(int i=0; i<length; i++){
            set.add(arr[i]);
        }
        int hashSize = set.size();
        int j = 0;
        for(Integer x : set){
            arr[j++] = x;
        }
        return hashSize;
    }

    public static int removeDuplicatesOptimal(int[] arr){
        /*
        Optimal Approach - 
        Use two pointers approach, if i and j have same value then don't do anything but if they are not same, replace it with prev
        Time Complexity - O(n*log(n))+O(n)
        */

        int length = arr.length;
        int i = 0;
        for(int j=0; j<length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    
}
