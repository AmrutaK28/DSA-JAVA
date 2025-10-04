/*
Catergory : Array
Complexity : Easy

Problem Statement: Find the second largest element in an array.

I/P - [8,8,7,6,5]
O/P - 7

I/P - [10,10,10,10,10]
O/P - 10

*/

public class SecondLargest {
    public static void main(String[] args){
        int[] arr1 = {8,8,7,6,5};
        System.out.println(findSecodLargestBF(arr1));
        System.out.println(findSecodLargestBetter(arr1));
        System.out.println(findSecodLargestBest(arr1));

        int[] arr2 = {10,10,10,10,10};
        System.out.println(findSecodLargestBF(arr2));
        System.out.println(findSecodLargestBetter(arr2));
        System.out.println(findSecodLargestBest(arr2));
    }

    public static int findSecodLargestBF(int[] arr){
        /*
        Brute Force Approach -
        Sort the array and then loop from end and keep comparing if its not the largest.
        Time Complexity - O(n log n)
        */
        int length = arr.length;
        java.util.Arrays.sort(arr);
        int largest = arr[length - 1];

        for(int i = length -2; i>=0; i--){
            if(arr[i] != largest){
                return arr[i];
            }
        }
        return largest;
    }

    public static int findSecodLargestBetter(int[] arr){
        /*
        Better Approach -
        Proess Array in two passes ; First to find the largest and 
        second to find the smallest that the largest found in 2st pass.

        Times Complexity - O(2n) ~ O(n)
        */
        int length = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        for(int i=0; i<length; i++){
            if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            return largest;
        }
        return secondLargest;
    }

    public static int findSecodLargestBest(int[] arr){
        /*
        Best Approach -
        Use 2 pointer approach - maintain 2 pointers - 
        1. largest and 2. second Largest
        and keep updating these variables

        Times Complexity - O(2n) ~ O(n)
        */
        int length = arr.length;
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;  // considering array will have positive values
        for(int i = 1; i < length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return largest;
        }
        return secondLargest;
    }
}
