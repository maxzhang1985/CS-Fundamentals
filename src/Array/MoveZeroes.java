package Array;

public class MoveZeroes {
    /**
     Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

     For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

     Note:
     You must do this in-place without making a copy of the array.
     Minimize the total number of operations.
     */

    public int[] moveZeroes(int[] nums) {
        /**
         * Input: nums = [0, 1, 0, 3, 12]
         * Expected Output: [1, 3, 12, 0, 0]
         * We need to move all zeroes to the end (update the input array)
         *
         * Case 1: a(i) == 0, do nothing
         * Case 2: a(i) != 0 && a[start] == 0, move curr element to the nums[start], swap position ,start++
         * Case 3: a(i) != 0 && a[start] != 0, start++
         *
         * Thus, we need a pointer to record how many zeroes we have.
         * And we need to iterate through the array to check elements one by one
         */

        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && nums[start] == 0) {
                nums[start++] = nums[i];
                nums[i] = 0;
            } else if (nums[i] != 0 && nums[start] != 0) {
                start++;
            }
        }
        return nums;
    }
}
