package String;

public class StringToInteger {
    public int myAtoi(String str) {
        // check empty string
        if (str.length() == 0) {
            return 0;
        }

        // check whitespace
        int start = 0;
        while (str.charAt(start) == ' ') {
            start++;
        }

        // check positive/negative
        int sign = 1;
        if (str.charAt(start) == '+') {
            start++;
        } else if (str.charAt(start) == '-') {
            sign = -1;
            start++;
        }

        // converting string to integer
        long res = 0;
        for (int i = start; i < str.length(); i++) {
            long temp;
            temp = str.charAt(i) - '0';
            if (temp < 0 || temp > 9) break; // if (!Character.isDigit(str.charAt(i)))
            res = res * 10 + temp;
            // check overflow
            if (sign == 1 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && res * -1 < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) res * sign;
    }

    public static void main(String[] args) {
        StringToInteger atoi = new StringToInteger();
        System.out.println(atoi.myAtoi("-123"));
        System.out.println(atoi.myAtoi("0"));
        System.out.println(atoi.myAtoi(""));
        System.out.println(atoi.myAtoi("-"));
        System.out.println(atoi.myAtoi("   456"));
        System.out.println(atoi.myAtoi("+"));
        System.out.println(atoi.myAtoi("+-2"));
        System.out.println(atoi.myAtoi("9223372036854775809"));
        System.out.println(atoi.myAtoi("-1256789678987654321"));
        System.out.println(atoi.myAtoi("  -0012a42"));
        System.out.println(atoi.myAtoi("-2147483648"));
        System.out.println(atoi.myAtoi("-2147483647"));
        System.out.println(atoi.myAtoi("2147483648"));
    }
}
