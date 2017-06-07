package Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    ValidParentheses _vp = new ValidParentheses();

    @Test
    public void test1(){
        String s = "{[()]}";
        assertEquals(true, _vp.isValid(s));
    }

    @Test
    public void test2() {
        String s = "{[}";
        assertEquals(false, _vp.isValid(s));
    }

    @Test
    public void test3() {
        String s = "}";
        assertEquals(false, _vp.isValid(s));
    }

    @Test
    public void test4() {
        String s = "{[()]}";
        assertEquals(true, _vp.isValidHash(s));
    }

    @Test
    public void test5() {
        String s = "((";
        assertEquals(false, _vp.isValid(s));
    }

    @Test
    public void test6() {
        String s = "(";
        assertEquals(false, _vp.isValid(s));
    }
}