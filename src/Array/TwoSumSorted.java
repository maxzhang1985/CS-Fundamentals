package Array;
import java.util.Arrays;
/**
    Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

    The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
    Please note that your returned answers (both index1 and index2) are not zero-based.

    You may assume that each input would have exactly one solution.

    Input: numbers={2, 7, 11, 15}, target=9
    Output: index1=1, index2=2
 */
//  Since its sorted already, we should make use of it - Two Pointers (one from start, one from end).
//    Time: O(n) - each element is visited at most once.
//    Space: O(1) - only use 2 indexes
public class TwoSumSorted {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] > target - numbers[end]) {
                end--;
            } else if (numbers[start] < target - numbers[end]) {
                start++;
            } else {
                return new int[] {start + 1, end + 1};
            }
        }
        return null;
    }
}
