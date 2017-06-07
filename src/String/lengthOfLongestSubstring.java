public class Solution {
    public int lengthOfLongestSubstring(String s) {
        final int notFound = -1;
        int length = 0;
        int start = 0;

        // Map<Character, Integer> map = HashMap<>();
        // When we see HashMap with character as key, we immediately know we can change it to int[256]
        int[] map = new int[256];
        for (int i = 0; i < 256; i++) {
            map[i] = notFound;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map[c] != notFound) {
                int pos = map[c];
                for (int j = start; j <= pos; j++) {
                    map[s.charAt(j)] = notFound;
                }
                start = pos + 1;
            }

            map[c] = i;
            length = Math.max(length, i - start + 1);
        }

        return length;
    }
}
