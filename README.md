# DSA-JAVA

This repository contains small Java solutions organized by problem. Each solved problem below is listed with a title, category, difficulty, a short description, the approach used in the repository, and time/space complexity. This format will make it easy to add more categories and difficulty levels later.

## Categories

- [Arrays](#arrays)

---

## Arrays

### Easy

Below are the problems currently mapped to the Arrays (Easy) subcategory. Click any link to jump to the detailed description for that problem.

- [Check If Array Is Sorted](#check-if-array-is-sorted)
- [Find Largest Element](#find-largest-element) 
- [Left Rotate Array By One](#left-rotate-array-by-one) 
- [Remove Duplicates From Sorted Array](#remove-duplicates-from-sorted-array) 
- [Find Second Largest Element](#find-second-largest-element) 

---

## Check If Array Is Sorted

- Category: Arrays
- Difficulty: Easy
- File: `array/CheckIfArraySorted.java`
- Description: Check whether an integer array is sorted in non-decreasing order.
- Approach: Single-pass adjacent comparison; return false on the first pair where `arr[i] > arr[i+1]`.
- Time complexity: O(n)
- Space complexity: O(1)

---

## Find Largest Element

- Category: Arrays
- Difficulty: Easy
- File: `array/Largest.java`
- Description: Find the largest element in an array.
- Approaches included:
  - Brute-force: compare elements in nested loops (O(n^2), O(1) space).
  - Optimal: single-pass keeping a running maximum (O(n), O(1) space).

---

## Left Rotate Array By One

- Category: Arrays
- Difficulty: Easy
- File: `array/LeftRotateByOne.java`
- Description: Left-rotate an array by one position.
- Approaches included:
  - Copy to a new array and fill (O(n) time, O(n) space).
  - In-place shift by storing the first element and shifting elements left (O(n) time, O(1) space).

---

## Remove Duplicates From Sorted Array

- Category: Arrays
- Difficulty: Easy
- File: `array/RemoveDuplicates.java`
- Description: Remove duplicates from a sorted array and return the new length (array compressed in-place in the optimal approach).
- Approaches included:
  - Brute-force (in the file): use a `HashSet` to collect unique values then write back (O(n) average time, O(n) space).
  - Optimal: two-pointer in-place overwrite to compress duplicates (O(n) time, O(1) space).

---

## Find Second Largest Element

- Category: Arrays
- Difficulty: Easy
- File: `array/SecondLargest.java`
- Description: Find the second largest element in an array. If all elements are equal, the implementations return the largest.
- Approaches included:
  - Sort and scan from the end (O(n log n) time).
  - Two-pass: find largest then find max < largest (O(n) time).
  - Single-pass: maintain both `largest` and `secondLargest` while scanning (O(n) time, O(1) space).

---

## Notes

- A `.gitignore` has been added to ignore compiled `.class` files and common IDE/build artifacts.
- If `.class` files are already tracked by Git, remove them from tracking using `git rm --cached` and commit the change.

If you'd like, I can:
- Add example input/output under each problem.
- Add small unit tests (JUnit) or simple runners for automated verification.
- Group problems by category in separate folders (e.g., `arrays/`, `strings/`) as you add more problems.
