package LeetCode;

public class Problem_2108 {
    // Problem 2108. Find Smallest Missing Positive Number


    public String firstPalindrome(String[] words) {
        String Output = "";

        for (String str : words) {
            if (pd(str)) {
//                System.out.println(str + " is a palindrome.");
                Output = str;
                System.out.println(str);
                break;

            } else {
//                System.out.println( str + " is not a palindrome.");
            }
        }
        return Output;
    }

    public static boolean pd(String str) {
        int FristIndex = 0;
        int LastIndex = str.length() - 1;

        while (FristIndex < LastIndex) {
            if (str.charAt(FristIndex) != str.charAt(LastIndex)) {
                return false;
            }
            FristIndex++;
            LastIndex--;
        }
        return true;
    }



    public static void main(String[] args) {

        Problem_2108 problem = new Problem_2108();
        String[] words = {"abc", "car", "ada", "racecar", "cool" };
        problem.firstPalindrome(words);

    }
}

