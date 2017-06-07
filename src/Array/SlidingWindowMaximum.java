package Array;

import java.util.LinkedList;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k <= 0 || k > nums.length) {
            // throw new IllegalArgumentException("Error");
            return new int[]{};
        }

        int[] result = new int[nums.length - k + 1];

        // O(n)
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!list.isEmpty()) {
                System.out.println("i: " + i);
                System.out.println("List: " + list);
                System.out.println("First: " + list.getFirst());
                System.out.println("Last: " + list.getLast());
                System.out.println("------");
            }
            if (!list.isEmpty() && list.getFirst() == i - k) {
                list.removeFirst();
            }

            while (!list.isEmpty() && nums[list.getLast()] <= nums[i]) {
                list.removeLast();
            }
            list.add(i);

            // add currMax into result when there are already k numbers being compared
            if (i >= k - 1) {
                result[i - k + 1] = nums[list.getFirst()];
            }
        }
//        if (k <= 0 || k > nums.length) {
//            return new int[]{};
//        }
//
//        int[] res = new int[nums.length - k + 1];
//
//        for (int i = 0; i < nums.length - k + 1; i++) {
//            int currMax = Integer.MIN_VALUE;
//            for (int j = i; j < i + k; j++) {
//                currMax = Math.max(nums[j], currMax);
//            }
//            res[i] = currMax;
//        }
        return result;
    }
}
