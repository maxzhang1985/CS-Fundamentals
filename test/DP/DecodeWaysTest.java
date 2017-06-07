package DP;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {
    DecodeWays _decodeWays = new DecodeWays();

    @Test
    public void test1() {
        String input = "12";
        int expected = 2;
        int actual = _decodeWays.numDecodings(input);
        assertEquals(expected, actual);
    }

}