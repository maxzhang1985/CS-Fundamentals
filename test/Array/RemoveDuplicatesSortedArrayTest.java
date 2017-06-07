package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesSortedArrayTest {
    RemoveDuplicatesSortedArray _rDSA = new RemoveDuplicatesSortedArray();

    @Test
    public void test1() {
        int[] input = {1, 1, 2, 2, 2, 2, 3, 4, 4, 5, 6, 7};
        assertEquals(7, _rDSA.removeDuplicates(input));
    }

    @Test
    public void test2() {
        int[] input = {1, 2, 2, 3};
        assertEquals(3, _rDSA.removeDuplicates(input));
    }

    @Test
    public void test3() {
        int[] input = {1,1,1,1,1,1,1,2,2,2,2,2,2,4,4,4,4,4,5};
        assertEquals(4, _rDSA.removeDuplicates(input));
    }
}