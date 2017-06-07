package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//1 is read off as "one 1" or 11.
//        11 is read off as "two 1s" or 21.
//        21 is read off as "one 2, then one 1" or 1211.

class CountAndSayTest {
    CountAndSay _cas = new CountAndSay();

    @Test
    public void test1() {
        int input = 4;
        String target = "1211";
        assertEquals(target, _cas.countAndSay(input));
    }

    @Test
    public void test2() {
        int input = 1;
        String target = "1";
        assertEquals(target, _cas.countAndSay(input));
    }

}