package Array;

/**
 * Design and implement a TwoSum class. It should support the following operations: add and find.

 add - Add the number to an internal data structure.
 find - Find if there exists any pair of numbers which sum is equal to the value.

 For example,
 add(1); add(3); add(5);
 find(4) -> true
 find(7) -> false
 */

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class TwoSumDesign {

    private final ArrayList<Integer> list = new ArrayList<>();

    // Add the number to an internal data structure.
    public void add(int number) {
        list.add(number);
    }

    // Find if there exists any pair of numbers which sum is equal to the value.
    public boolean find(int value) {
        final Map<Integer, Integer> remainMap = new HashMap<>(); //<remain, index>
        for (int i = 0; i < list.size(); i++) {
            if (remainMap.containsKey(list.get(i))) {
                return true;
            } else {
                remainMap.put(value - list.get(i), i);
            }
        }
        return false;
    }
}

// Your TwoSum object will be instantiated and called as such:
// TwoSumDesign twoSum = new TwoSumDesign();
// twoSum.add(number);
// twoSum.find(value);
