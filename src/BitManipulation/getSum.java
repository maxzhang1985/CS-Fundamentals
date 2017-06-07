package BitManipulation;
/**
 For this, problem, for example, we have a = 1, b = 3,
 In bit representation, a = 0001, b = 0011,
 First, we can use "and"("&") operation between a and b to find a carry.
 carry = a & b, then carry = 0001
 Second, we can use "xor" ("^") operation between a and b to find the different bit, and assign it to a,
 Then, we shift carry one position left and assign it to b, b = 0010.
 Iterate until there is no carry (or b == 0)
 */

public class getSum {
    public static void main(String[] args) {
        getSum gs = new getSum();
        System.out.println(gs.getSum(123,456) == 579);
    }

    private int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}

