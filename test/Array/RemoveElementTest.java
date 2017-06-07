package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    RemoveElement _re = new RemoveElement();

    @Test
    public void test1() {
        int[] arr = {3, 2, 2, 3};
        assertEquals(2, _re.removeElement1(arr, 3));
    }

    @Test
    public void test2() {
        int[] arr = {1, 2, 3, 3, 7, 7, 3, 4, 3, 2, 2, 5};
        assertEquals(9, _re.removeElement1(arr, 2));
    }

}