package Array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumTest {
    SlidingWindowMaximum swe = new SlidingWindowMaximum();

    @Test
    public void test1() {
        int[] input = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] output = new int[]{3,3,5,5,6,7};
        assertArrayEquals(output, swe.maxSlidingWindow(input, 3));
    }

}