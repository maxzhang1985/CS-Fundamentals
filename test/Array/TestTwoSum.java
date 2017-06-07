package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTwoSum {
    TwoSum _twoSum = new TwoSum();

    @Test
    public void test1() {
        int[] A = {2, 7, 12, 15};
        int target = 27;
        int[] expected = {2,3};
        assertArrayEquals(expected, _twoSum.twoSum(A, target));
    }

    @Test
    public void test2() {
        int[] A = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, _twoSum.twoSum(A, target));
    }
}
