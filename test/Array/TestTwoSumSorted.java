package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTwoSumSorted {
    TwoSumSorted _twoSumSorted = new TwoSumSorted();

    @Test
    public void test1() {
        int[] A = new int[] {1, 3, 5, 7};
        int target = 10;
        int[] expected = new int[] {2, 4};
        assertArrayEquals(expected, _twoSumSorted.twoSum(A, target));
    }

    @Test
    public void test2() {
        int[] A = new int[] {2, 5, 7, 123, 234, 2314};
        int target = 2548;
        int[] expected = new int[] {5, 6};
        assertArrayEquals(expected, _twoSumSorted.twoSum(A, target));
    }
}