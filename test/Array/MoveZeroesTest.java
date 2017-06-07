package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {
    MoveZeroes _mz = new MoveZeroes();

    @Test
    public void test1() {
        int[] arr = {0, 1, 0, 3, 12};
        int[] expected_arr = {1, 3, 12, 0, 0};
        assertArrayEquals(expected_arr, _mz.moveZeroes(arr));
    }

    @Test
    public void test2() {
        int[] arr = {0, 1, 6, 4, 0, 0, 3, 5, 0, 3, 12};
        int[] expected_arr = {1, 6, 4, 3, 5, 3, 12, 0, 0, 0, 0};
        assertArrayEquals(expected_arr, _mz.moveZeroes(arr));
    }

    @Test
    public void test3() {
        int[] arr = {1, 3, 5, 0, 0, 7, 9};
        int[] expected_arr = {1, 3, 5, 7, 9, 0, 0};
        assertArrayEquals(expected_arr, _mz.moveZeroes(arr));
    }

}