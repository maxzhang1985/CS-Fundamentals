package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {
    LongestValidParentheses _lvp = new LongestValidParentheses();

    @Test
    public void test1() {
        String s = ")()())";
        assertEquals(4, _lvp.longestValidParentheses1(s));
    }

    @Test
    public void test2() {
        String s = "()(())";
        assertEquals(6, _lvp.longestValidParentheses1(s));
    }

    @Test
    public void test3() {
        String s = "())((())";
        assertEquals(4, _lvp.longestValidParentheses1(s));
    }

}