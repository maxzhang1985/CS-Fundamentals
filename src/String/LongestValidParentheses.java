package String;

import java.util.Arrays;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int length = 0;
        int n = s.length();
        int[] array = new int[n + 1];

        for (int i = -1; i < n; i++) {
            // start[i] = i + 1;
            array[i + 1] = i + 1;
        }

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ')' && s.charAt(i - 1) == '(' ) {
                // start[i] = start[i - 2]
                array[i + 1] = array[i - 1];
                length = Math.max(length, i - array[i + 1] + 1);
            } else if ( s.charAt(i) == ')' && s.charAt(i - 1) == ')' &&
                    // s.charAt(s)tart[i - 1] - 1) != '('
                    array[i] - 1 >= 0 && s.charAt(array[i] - 1) == '('
                    ) {
                //  start[i] = start[start[i - 1] - 2];
                array[i + 1] = array[array[i] - 1];
                length = Math.max(length, i - array[i + 1] + 1);
            }
        }
        System.out.println(Arrays.toString(array));
        return length;
    }

    public int longestValidParentheses1(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        System.out.println(Arrays.toString(dp));
        return maxans;
    }
}
