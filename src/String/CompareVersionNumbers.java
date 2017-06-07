package String;

import java.util.Arrays;

/**
LC 165. Compare Version Numbers
Compare two version numbers version1 and version2.
        If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

        You may assume that the version strings are non-empty and contain only digits and the . character.
        The . character does not represent a decimal point and is used to separate number sequences.
        For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

        Here is an example of version numbers ordering:

        0.1 < 1.1 < 1.2 < 13.37
 */

public class CompareVersionNumbers {
    public static void main(String[] args) {
        CompareVersionNumbers cvn = new CompareVersionNumbers();
        String v1 = "13.57.2.35";
        String v2 = "13.57.2.17";
        System.out.println(cvn.compareVersionNumbers(v1, v2));
    }

    public int compareVersionNumbers(String version1, String version2) {
        if (version1.equals(version2)) return 0;    // Base case: check if 2 strings are the same
        String[] A = version1.split("\\.", 2);  // Separate string into an array of 2 by the 1st dot
        String[] B = version2.split("\\.", 2);
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(B));

        if (Integer.valueOf(A[0]) > Integer.valueOf(B[0])) {    // Use Integer.valueOf(String[]) to compare numbers not characters (i.e. 'a')
            return 1;
        } else if (Integer.valueOf(A[0]) < Integer.valueOf(B[0])) {
            return -1;
        } else {
            return compareVersionNumbers(A.length == 1 ? "0" : A[1], B.length == 1 ? "0" : B[1]);   // Use Recursion to evaluate the 2nd part of the String[] if 1st element is the same
        }
    }
}
