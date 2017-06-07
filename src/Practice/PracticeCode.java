package Practice;

import com.sun.tools.javac.util.ArrayUtils;
import com.sun.tools.javac.util.List;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class PracticeCode {
    public static void main(String[] args) {
//      Using Array
//        int[] firstArray = new int[5];
//        System.out.println(Arrays.toString(firstArray));
//        for (int x : firstArray) {
//            System.out.println(x);
//        }
//
//        int[] secondArray = new int[] {1,3,5,7};
//        System.out.println(Arrays.toString(secondArray));
//        for (int x : secondArray)
//            System.out.println(x);

//      ArrayList
//        ArrayList<Integer> firstArrayList = new ArrayList<>(100);
//        firstArrayList.add(5);
//        firstArrayList.add(15);
//        firstArrayList.add(25);
//        System.out.println(firstArrayList.size());
//        System.out.println(Arrays.toString(firstArrayList.toArray()));
//        for (int z : firstArrayList)
//            System.out.println(z);

//        String[] words = new String[] {"abc", "def"};
//        String[] more = new String[] {"hello", "world"};
//        System.out.println(Arrays.toString(words));
//        System.out.println(Arrays.toString(more));
//
//        PracticeCode m = new PracticeCode(); // Don't forget! Class is just a template; We need a 'real' object to use functions
//        System.out.println(m.merge(words, more));
//    }
//
//    ArrayList<String> merge(String[] words, String[] more) {
//        ArrayList<String> sentence = new ArrayList<String>();
//        for (String w : words)
//            sentence.add(w);
//        for (String w : more)
//            sentence.add(w);
//        return sentence;

//    Reverse the characters in a string
//        PracticeCode re = new PracticeCode();
//        char[] chars = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
//        System.out.println(chars); //abcdefg
//        System.out.println(Arrays.toString(chars)); //[a, b, c, d, e, f, g]
//
//        char[] res = re.reverse(chars);
//        System.out.println(res); //gfedcba
//        System.out.println(Arrays.toString(res));

//        PracticeCode ri = new PracticeCode();
//        System.out.println(ri.reverseInteger(135));
//        int[] nums = new int[]{5,4,3,2,1};
//        int[] nums2 = new int[]{1,1,1,1,1,1};
//        int[] nums3 = new int[]{1,1,2,2};
////
//        PracticeCode sm = new PracticeCode();
//        System.out.println(sm.secondMax(nums));
//        System.out.println(sm.secondMax(nums2));
//        System.out.println(sm.secondMax(nums3));

//        PracticeCode lintcode = new PracticeCode();
//        System.out.println(lintcode.strStr("mississippi", "issipi")); // -1
//        System.out.println(lintcode.strStr("abcdefg", "bcd")); // 1
//        System.out.println(lintcode.strStr("", "")); // 0

//        PracticeCode fb = new PracticeCode();
//        System.out.println(fb.fizzBuzz(15));

//        PracticeCode ri = new PracticeCode();
//        System.out.println(ri.charToInteger('%'));

//        ArrayList<Integer> al = new ArrayList<>();
//        for (int i= 1; i <= 100; i++) {
//            al.add(i);
//        }
//        System.out.println(al);

//      Convert Integer Array List to Integer Array
//        ArrayList<Integer> arl = new ArrayList<Integer>();
//        arl.add(1);
//        arl.add(3);
//        arl.add(5);
//
//        int[] arrArr = new int[arl.size()];
//        for (int i=0; i < arrArr.length; i++)
//        {
//            arrArr[i] = arl.get(i);
//        }
//
//        for (int i : arrArr) {
//            System.out.println(i);
//        }

//      Convert String Array List to String Array
//        ArrayList<String> stockList = new ArrayList<String>();
//        stockList.add("stock1");
//        stockList.add("stock2");
//
//        String[] stockArr = new String[stockList.size()];
//        stockArr = stockList.toArray(stockArr);
//
//        for(String s : stockArr)
//            System.out.println(s);

//      Swap Two Integers in Array
//        PracticeCode si = new PracticeCode();
//        int[] A = new int[]{1,3,5,7,9};
//        System.out.println(Arrays.toString(si.swapIntegers(A, 2, 4)));

//        String a = "0123";
//        System.out.println(a);
//        for (int i = 0; i < a.length(); i++) {
//            int b = a.charAt(i) - '0' ;
//            // - '0' means: set 0 to be the starting point in the ASCII Table by moving 48 in order (0 was #48 when convert to integer)
//            System.out.println(b);
//        }


//        String str = "aBc12";
//        String res = "";
//        System.out.println(res.length() == 0);
//        for (int i = 0; i < str.length(); i++) {
//            res = res + Character.toUpperCase(str.charAt(i));
//        }
//        System.out.println(res);

//        ArrayList<Integer> arrl = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            arrl.add(i);
//        }
//        arrl.add(10);
//        for (int arr : arrl) {
//            System.out.println(arr);
//        }
//        int[] arr = new int[] {1, 5, 4};
//        int sum = 0;
//        for (int e : arr) {
//            sum += (int) Math.pow(2, e);
//        }
//        System.out.println(sum);

//        Linked-List
//        LinkedList<Integer> a = new LinkedList<>();
//        a.add(1);
//        a.add(2);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.add(5);
//        a.remove(0);
//        a.remove(new Integer(2));
//        System.out.println(a);
//        System.out.println(a.size());
//        System.out.println(a.getFirst());
//        System.out.println(a.getLast());

//        ArrayDeque
        ArrayDeque<Integer> b = new ArrayDeque<>();
        b.addLast(1);
        for (int i = 2; i <= 7; i++) {
            b.addLast(i);
        }
        b.removeFirst();
        b.addLast(8);
        b.addLast(9);
        b.addFirst(1);
        b.addLast(2);
        b.addFirst(2);
        System.out.println(b);
        System.out.println(b.size());
        System.out.println(Integer.toBinaryString(7));

    }

    public int secondMax(int[] nums) {
        /* your code */
//        Method 1
//        Arrays.sort(nums);
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            list.add(nums[i]);
//        }
//        list.removeAll(Arrays.asList(nums[nums.length - 1]));
//        if (list.size() == 0) {
//            return nums[nums.length - 1];
//        } else {
//            return (int) list.get(list.size() - 1);
//        }
//        Method 2

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
//        int max = Math.max(nums[0], nums[1]);
//        int second = Math.min(nums[0], nums[1]);
//        then iterate starting i = 2

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }
        return second;
    }

//Basic Two Pointer Technique
//Reverse the characters in a string
    public char[] reverse(char[] chars) {

//      for loop
//        for (int i = 0; i < chars.length / 2; i++) {
//            char temp = chars[i];
//            chars[i] = chars[chars.length - 1 - i];
//            chars[chars.length - 1 - i] = temp;
//        }

//      while loop
        int i = 0, j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return chars;
    }

    public int reverseInteger(int number) {
        // write your code here
        int answer;
        String tempStr = Integer.toString(number);
        int[] intArr = new int[tempStr.length()];
        for (int i = 0; i < tempStr.length(); i++) {
            intArr[i] = tempStr.charAt(i) - '0';
        }
        answer = intArr[2] * 100;
        answer += intArr[1] * 10;
        answer += intArr[0];
        return answer;
    }

    private int strStr(String haystack, String needle) {
        return -1;
    }

    private ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("fizz buzz");
            } else if (i % 3 == 0) {
                res.add("fizz");
            } else if (i % 5 == 0) {
                res.add("buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }

    private int charToInteger(char character) {
//        Solution 1:
//        int res = character - 'a' + 97;
//        return res

//      Solution 2:
        return (int) character;
    }

    private int[] swapIntegers(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
        return A;
    }
}
