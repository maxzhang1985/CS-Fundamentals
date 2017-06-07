package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() > 20100 || p.length() > 20100) {
            return new ArrayList<Integer>(0);
        }

        ArrayList<Integer> result = new ArrayList<>();

        char[] charP = p.toCharArray();
        Arrays.sort(charP);
        String sortedP = new String(charP);

        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            char[] substring = s.substring(i, i + p.length()).toCharArray();
            Arrays.sort(substring);
            String sortedS = new String(substring);

            if (sortedS.equals(sortedP)) {
                result.add(i);
            }
        }
        return result;
    }
}
