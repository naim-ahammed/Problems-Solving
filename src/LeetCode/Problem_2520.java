package LeetCode;

public class Problem_2520 {


    // Problem 2520. Largest Number After Decreasing Digits
    public int countDigits(int num) {

        int val = 0;
//        int num = 121;
        int temp =num;


        while (num > 0) {
            int digit = num % 10;
            if (temp % digit == 0) {
                val++;
            }
            num /= 10;
        }
        System.out.println(val);
        return val;

    }

    public static void main(String[] args) {

        int num = 1248;
        Problem_2520 problem = new Problem_2520();
        problem.countDigits(num);
//        System.out.println(num);

    }
}
