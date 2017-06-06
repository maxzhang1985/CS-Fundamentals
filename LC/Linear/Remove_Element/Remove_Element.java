public class Solution {
    public int removeElement(int[] nums, int val) {
        /*
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
        return length;
    }
}
