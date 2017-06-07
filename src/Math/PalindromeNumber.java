package Math;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.palindromeNumber(12321));
        System.out.println(pn.palindromeNumber(1232));
        System.out.println(pn.palindromeNumber(1));
    }

    private boolean palindromeNumber(int n) {
        // Method 1: reverse integer, and compare to the original. Space: O(1)
        // Problems related with numbers are frequently solved by / and %. No need of extra space is required.
        if (n < 0) {
            return false;
        }

        int org = n;
        long result = 0;
        while (n != 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }

        if (result > Integer.MAX_VALUE) {
            return false;
        }

        return org == (int) result;

        // Method 2: two pointers. Space: O(n)
//        boolean result = true;
//        String num = Integer.toString(n);
//        int i = 0;
//        int j = num.length() - 1;
//        while (i < j) {
//            if (num.charAt(i) != num.charAt(j)) {
//                result = false;
//            }
//            i++;
//            j--;
//        }
//        return result;
    }
}
