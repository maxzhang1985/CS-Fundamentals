package DP;

import java.util.*;

public class DecodeWays {
    public int numDecodings(String s) {
        if (s.length() <= 0) {
            return 0;
        }

        Map<String, String> map = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            map.put(String.valueOf(i), Character.toString((char) (i - 1 + 'A')));
        }

        List<List<String>> allResults = new ArrayList<>();

        // i = -1
        allResults.add(new ArrayList<>(Arrays.asList("")));

        // i = 0
        char cI = s.charAt(0);
        if ('1' <= cI && cI <= '9') {
            allResults.add(new ArrayList<>(Arrays.asList(map.get(s.substring(0, 1)))));
        }

        // i = 1 : n - 1
        for (int i = 1; i < s.length(); i++) {
            List<String> listI = new ArrayList<>();
            if (s.charAt(i) != '0') {
                for (String sI : allResults.get(i)) {
                    listI.add(sI + map.get(s.charAt(i) + ""));
                }
            }
            if (10 <= Integer.valueOf(s.substring(i - 1, i + 1)) && Integer.valueOf(s.substring(i - 1, i + 1)) <= 26) {
                for (String sI : allResults.get(i - 1)) {
                    listI.add(sI + map.get(s.substring(i - 1, i + 1)));
                }
            }
            allResults.add(listI);
        }
        System.out.println(allResults);
        return allResults.size() - 1;
    }
}
