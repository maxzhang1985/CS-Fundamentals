package Array;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
        /**
         *  Input: [9,9]
         *  Expected Output: [1,0,0]
         *  Goal: to add one into the digits, and return new array
         *
         *  Start from the right (i.e. last element in the array)
         *  Case 1: a[i] < 9, +1 to a[i], return the array.
         *  Case 2: a[i] == 9 && a[0] != 9, a[i] to 0, a[i-1]+1 and return the array
         *  Case 3: a[i] == 9 && a[0] == 9, create a new array with size n+1, with 1 as 1st element and return
         *
         */

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }
}
