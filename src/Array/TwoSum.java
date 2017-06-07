package Array;

/**
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution.

    Example:
    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
    The return format had been changed to zero-based indices. Please read the above updated description carefully.
*/

/*
    Example:
    Input: array = [1, 3, 5, 7], target = 10
    Expected output: array = [1, 3]

    We can use Mathematical Induction to prove a solution that can hold data from 0 to i - 1 given data with i length
    we need to find a[i] such that a[i] + a[j] == target for a(0 -> i - 1) as the range.
    In other words, a[i] == target - a[j]. Thus, we know that we need to find a constant in a collection --> HashMap
    Now, lets look up all the cases:
    for a[i] == target - a[j], return array = [i, j]
    for a[i] != target - a[j], store (a[i] as key, i as value) into hash map
*/
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length < 2) {
            return new int[] {0, 0};
        }

        Map<Integer, Integer> remainSet = new HashMap<>(); // <remain, index>

        for (int i = 0; i < nums.length; i++) {
            if (remainSet.containsKey(nums[i])) { // a[i] == target - a[j]
                return new int[] {remainSet.get(nums[i]), i};
            } else { // a[i] != target - a[j]
                remainSet.put(target - nums[i], i);
            }
        }
        throw new IllegalArgumentException("No Two Sum");
    }

    public int[] twoSum_BT(int[] nums, int target) {
//         * Brute Force, O(n^2) time, O(1) space
//         * For each element, loop through the rest of array to find if the sum equals to target
//         * Otherwise throw exception
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Two Sum");
    }
}