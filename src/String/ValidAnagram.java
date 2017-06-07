package String;
//LC 242, Variant (message in magazine)

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram ir = new ValidAnagram();

        String magazine = "blahanthonycarihaverouyhaha";
        String message = "Anthony";

        System.out.println(ir.isRansomable(magazine, message));
    }

    public boolean isRansomable(String magazine, String message) {
        if (magazine.length() < message.length()){
            return false;
        }

        int[] allChar = new int[256];

        for (int i = 0; i < magazine.length(); i++){
            allChar[Character.toLowerCase(magazine.charAt(i))]++; //[1,2,3]
        }

        for (int j = 0; j < message.length(); j++) {
            allChar[message.charAt(j)]--; //found one
            if (allChar[Character.toLowerCase(message.charAt(j))] < 0) {
                return false;
            }
        }

        return true;
    }
}
