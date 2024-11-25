package LeetCode;

public class Problem_1486 {


    // Problem 1486. XOR Operation in an Array

    public static void main(String[] args) {

        int n = 5;
        int start = 0;
        int nums=start;
        int temp =0 ;
//        int[] nums;

        for (int i = 0; i < n; i++) {

            temp = temp^nums;

            nums = nums + 2;



//            if(n == temp){
//                System.out.println(temp);
//
//            }

        }
        System.out.println(temp );

    }
}


//        int a = 3; // 1010 in binary
//        int b = 5; // 0110 in binary
//        int c = 7; //
//        int d = 9; // 0110 in binary
//
//        int result = a ^ b ^ c ^ d; // 1100 in binary
//
//        System.out.println( result);