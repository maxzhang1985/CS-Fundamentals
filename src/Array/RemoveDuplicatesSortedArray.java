package Array;

import java.util.Arrays;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */

//    Use Two Pointers
//    Time: O(n) - each of the two pointers only traverses at most n steps
//    Space: O(1)
public class RemoveDuplicatesSortedArray {
    /** Example:
     * Input: [1,1,2,3,3,5] --> [1,2,3,5,x,x]
     * Output: 4
     *
     * Input: [1,2,3,3,5] --> [1,2,3,5,5]
     *
     * We need to remove all duplicates, and update the array in place, and return the new length with all unique numbers.
     * We can use a pointer to track the position of the last unique number, and return the pointer.
     *
     * Since the input array is sorted,
     * pointer = 1
     * Case 1: a[i] == a[i + 1], do nothing
     * Case 2: a[i] != a[i + 1], a[pointer] = a[i + 1], pointer++
     *
     */

    public int removeDuplicates(int[] nums) {
        int pointer = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[pointer++] = nums[i + 1];
            }
        }

        return pointer;
    }
}