package OA.LiveRamp;

public class MonkeyRiver {
    public static int solution(int[] A, int D) {
        if (A == null || A.length == 0)
            return -1;
        if (D > A.length)
            return 0;

        int B[] = new int[A.length + 1]; // create a new array B to copy A
        for (int i = 0; i < D; i++) { // for any index smaller than the step D, same element
            B[i] = A[i];
        }
        for (int i = D; i < A.length; i++) { // for the rest, if -1 then -1, if all previous D steps not all -1, B[i] = A[i]
            if (A[i] == -1) {
                B[i] = -1;
            } else {
                int temp = Integer.MAX_VALUE;
                int count = 0;
                for (int j = 1; j <= D; j++) {
                    if (B[i - j] == -1) {
                        count++;
                        continue;
                    }
                    temp = Math.min(temp, B[i - j]);
                }
                B[i] = count == D ? -1 : Math.max(temp, A[i]);
            }
        }

        int res = Integer.MAX_VALUE;
        int count = 0;
        for (int j = 1; j <= D; j++) { // check if all previous D steps are -1, then -1.
            if (B[A.length - j] == -1) {
                count++;
                continue;
            }
            res = Math.min(res, B[A.length - j]); // otherwise, result is the minimum of the step from last to D + 1
        }
        return res = count == D ? -1 : res;
    }

    public static void main(String[] args) {
        MonkeyRiver mr = new MonkeyRiver();
        int[] A = new int[]{1, -1, 0, 2, 3, 5};
        System.out.println(mr.solution(A, 3));

    }
}
