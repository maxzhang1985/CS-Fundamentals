package Math;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverseInteger(12345));
        System.out.println(ri.reverseInteger(0));
        System.out.println(ri.reverseInteger(-123));
        System.out.println(ri.reverseInteger(1534236469));
    }

//  Not creating extra space;
    public int reverseInteger(int x) {
        long result = 0;

        while (x != 0) {
            result = result * 10 +  x % 10;
            x = x / 10;
        }

        // handle overflow case
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }
}
