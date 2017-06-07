package BitManipulation;

/** A non-empty zero-indexed array A consisting of N non-negative integers is given. Its binarian is defined as:
 * binarian(A) = pow2(A[0]) + pow2(A[1]) + ... + pow2(A[N-1]) where pow2(K) = 2^k
 * For example, the binarian of array A such that A[1, 5, 4] equals 50.
 *
 * Write a function that, given an array A consisting of N non-negative integers, returns the length of the shortest array that has the same binarian as array A.
 * For example, given array A such that: A[1, 0, 2, 0, 0, 2] should return 3 because:
 * 1) the binarian of A is 13.
 * 2) array B such that B[0] = 3, B[1] = 2, B[2] = 0 also has a binarian of 13
 * 3) there is no shorter array with a binarian of 13.
 *
 * Assume that: N is an integer within the range [1..100,000], & each element of array A is an integer with the range [0..10,000]
 *
 * Complexity:
 *  Time: O(N*log(N))
 *  Space: O(N)
 */

public class Binarian {
    public int solution(int[] A) {
        int sum = binarian(A);
        int numBits = countNumberBits(sum);
        return numBits;
    }

    public int binarian(int[] A) {
        int n = A.length;
        int result = 0;

        for (int e : A) {
            result += (int) Math.pow(2, e);
        }
        System.out.println("result: " + result);
        return result;
    }

    public int countNumberBits(int sum) {
        int count = 0;
        while (sum > 0) {
            sum &= (sum - 1);
            System.out.println("sum: " + sum);
            count += 1;
        }
        return count;
    }

    public static void main (String args[]) {
        Binarian br = new Binarian();
        int[] arr = new int[]{1,0,2,0,0,2};

        System.out.println(br.solution(arr));
    }
}
