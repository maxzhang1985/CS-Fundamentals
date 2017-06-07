package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 Given two strings s and t, write a function to determine if t is an anagram of s.
 For example, s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.
 */

public class ValidAnagram {
    public boolean isAnagramHM(String s, String t) {
        /**
         * Example,
         * "anagram" <--> "nagaram"
         * "rat" <-!-> "car
         *
         * We need to compare two strings to check:
         * 1) if they contain exact same number of characters
         * 2) if they contain exact same characters
         *
         * We can sort the string, and compare each character one by one, true if all pass
         * or
         * We can use HashMap to store the character with corresponding frequency,
         * fill the hashmap for the 1st string, and clean the hashmap for the 2nd string,
         * the hashmap should be all zeros if two strings are anagram
         *
         * Case 1: table1 contains all zero ---> true
         * Case 2: table1 doesn't contain all zero ---> false
         */

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>(); // <Character, Frequency>


        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);

            if (map.containsKey(c1)) {
                map.put(c1, map.get(c1) + 1);
            } else {
                map.put(c1, 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            char c2 = t.charAt(j);

            if (map.containsKey(c2)) {
                map.put(c2, map.get(c2) - 1);
            } else {
                return false;
            }
        }

        for (Integer k : map.values()) {
            if (k != 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] table = new int[26]; // int[256] -> no need to shift index

        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++; // 97 - 97 = 0
            table[t.charAt(i) - 'a']--; // 110 - 97 = 13
        }

        for (int i : table) {
            if (i != 0) {
                return false;
            }
        }

        return true;

//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        int[] table = new int[256];
//
//        for (int i = 0; i < s.length(); i++) {
//            table[s.charAt(i)]++;
//        }
//
//        for (int j = 0; j < t.length(); j++) {
//            table[t.charAt(j)]--;
//            if (table[t.charAt(j)] < 0) {
//                return false;
//            }
//        }
//
//        return true;
    }
}
