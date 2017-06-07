package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestRectangleInHistogramTest {
    LargestRectangleInHistogram _lrh = new LargestRectangleInHistogram();

    @Test
    public void test1() {
        int[] heights = {2,1,5,6,2,3};
        assertEquals(10, _lrh.largestRectangleArea(heights));
    }

    @Test
    public void test2() {
        int[] heights = {};
        assertEquals(0, _lrh.largestRectangleArea(heights));
    }
}