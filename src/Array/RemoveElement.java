package Array;

import java.util.Arrays;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 Do not allocate extra space for another array, you must do this in place with constant memory.
 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:
 Given input array nums = [3,2,2,3], val = 3

 Your function should return length = 2, with the first two elements of nums being 2.
 */

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                end++;
                nums[end] = nums[i];
            }
        }
        return end + 1;
    }

    public int removeElement1(int[] nums, int val) {
        /**
        Input: nums = [3, 2, 2, 3], val = 3
        Expected output: length = 2

        We need to count all the elements that is not removed, and update the array within the new length.
        ==> a pointer to count this (int)

        To do this, we need to iterate through the input array.
        for a(i) == target, we do nothing
        for a(i) != target, we update the array & increment the pointer
        */

        int length = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[length++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return length;
    }
}
