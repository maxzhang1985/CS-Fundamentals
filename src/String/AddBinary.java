package String;

/**
LC 67. Add Binary
 Given two binary strings, return their sum (also a binary string).

 For example,
 a = "11"
 b = "1"
 Return "100".
*/

public class AddBinary {
    public static void main(String[] args){
        AddBinary ab = new AddBinary();
        String A = "101";
        String B = "111";
        System.out.println(ab.addBinary(A, B));
    }

    public String addBinary(String a, String b) {
//      Use StringBuffer to reverse the original string so it can be manipulated by index from left
        String A = new StringBuffer(a).reverse().toString();
        String B = new StringBuffer(b).reverse().toString();
//      Use StringBuilder to create a mutable string to store the answer
        StringBuilder answer = new StringBuilder();

        System.out.println(A);
        System.out.println(B);
        System.out.println("start:");
        System.out.println("------");

        int i = 0, j = 0, sum = 0, carry = 0;
//      As long as there is a carry from previous or original string left, continue
        while (i < A.length() || j < B.length() || carry > 0) {
//          Reset the sum to be carry from previous
            sum = carry;
//          If counter exceeds string length -> substitute with 0
            sum += i >= A.length() ? 0 : A.charAt(i) - '0';
            sum += j >= B.length() ? 0 : B.charAt(j) - '0';
            if (i < A.length()) {
                System.out.println("A[" + i + "]: " + A.charAt(i));
            } else {
                System.out.println("A[" + i + "]: 0 since its over");
            }
            if (j < B.length()) {
                System.out.println("B[" + j + "]: " + B.charAt(j));
            } else {
                System.out.println("B[" + j + "]: 0 since its over");
            }
            System.out.println("sum: " + sum);
            answer.append(sum % 2);
            System.out.println("ans: " + answer);
            carry = sum / 2;
            System.out.println("carry: " + carry);
            System.out.println("------");
            i++;
            j++;
        }
//      Reverse the order to normal and make it a string
        return answer.reverse().toString();
    }
}
