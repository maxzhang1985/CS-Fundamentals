package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumDesignTest {
    TwoSumDesign _tsd = new TwoSumDesign();

    @Test
    public void test1() {
        _tsd.add(3);
        _tsd.add(4);
        _tsd.add(5);
        assertEquals(true, _tsd.find(9));
        assertEquals(false, _tsd.find(100));
    }

    @Test
    public void test2() {
        _tsd.add(1);
        _tsd.add(3);
        _tsd.add(4);
        assertEquals(true, _tsd.find(4));
        assertEquals(false, _tsd.find(47));
    }
}
