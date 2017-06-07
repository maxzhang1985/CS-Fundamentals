package Array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    PlusOne _po = new PlusOne();

    @Test
    public void test1() {
        int[] input = new int[] {1,1,9};
        int[] output = new int[] {1,2,0};
        assertArrayEquals(output, _po.plusOne(input));
    }

    @Test
    public void test2() {
        int[] input = new int[] {1,1,1};
        int[] output = new int[] {1,1,2};
        assertArrayEquals(output, _po.plusOne(input));
    }

    @Test
    public void test3() {
        int[] input = new int[] {9,9};
        int[] output = new int[] {1,0,0};
        assertArrayEquals(output, _po.plusOne(input));
    }

    @Test
    public void test4() {
        int[] input = new int[] {2,9,9};
        int[] output = new int[] {3,0,0};
        assertArrayEquals(output, _po.plusOne(input));
    }

    @Test
    public void test5() {
        int[] input = new int[] {};
        int[] output = new int[] {3,0,0};
        assertArrayEquals(output, _po.plusOne(input));
    }

}