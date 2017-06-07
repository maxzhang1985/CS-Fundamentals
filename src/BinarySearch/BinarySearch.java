package BinarySearch;

public class BinarySearch {
    public int binarySearch(int[] list, int target) {
        if (list == null || list.length == 0) {
            return -1;
        }

        int start = 0, end = list.length - 1;
        // search when the range has at least 3 elements
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (list[mid] == target) {
                return mid;
            } else if (list[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        // search when the range has only 1 or 2 elements
        if (list[start] == target) {
            return start;
        } else if (list[end] == target) {
            return end;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 4, 5, 5};
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(nums, 2)); // 1 or 2
        System.out.println(bs.binarySearch(nums, 5)); // 4 or 5
        System.out.println(bs.binarySearch(nums, 6)); // -1
    }
}
