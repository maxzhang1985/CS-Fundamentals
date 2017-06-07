package HashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    ValidAnagram _va = new ValidAnagram();

    @Test
    public void test1() {
        String a = "anagram";
        String b = "nagaram";
        assertEquals(true, _va.isAnagram(a, b));

    }

    @Test
    public void test2() {
        String a = "rat";
        String b = "car";
        assertEquals(false, _va.isAnagram(a, b));
    }

    @Test
    public void test3() {
        String a = "";
        String b = "";
        assertEquals(true, _va.isAnagram(a, b));
    }

}