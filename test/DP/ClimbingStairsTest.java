package DP;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    ClimbingStairs _climbStairs = new ClimbingStairs();

    @Test
    public void test() {
        int n = 5;
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 1, 2, 3, 4, 5),
                Arrays.asList(0, 1, 2, 3, 5),
                Arrays.asList(0, 1, 2, 4, 5),
                Arrays.asList(0, 1, 2, 5),
                Arrays.asList(0, 1, 4, 5),
                Arrays.asList(0, 1, 3, 5),
                Arrays.asList(0, 3, 5),
                Arrays.asList(0, 2, 5),
                Arrays.asList(0, 1, 2, 5),
                Arrays.asList(0, 2, 3, 5),
                Arrays.asList(0, 2, 4, 5),
                Arrays.asList(0, 3, 4, 5),
                Arrays.asList(0, 1, 3, 4, 5),
                Arrays.asList(0, 2, 3, 4, 5)
        );
        List<List<Integer>> actual = _climbStairs.climbStairs(n);
        System.out.println(actual);
//        assertEquals(expected, actual);
    }

}