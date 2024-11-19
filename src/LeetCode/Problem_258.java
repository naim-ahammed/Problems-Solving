package LeetCode;

public class Problem_258 {


//    Problem  258. Add Digits
//    https://leetcode.com/problem-list/prshgx6i/

    public int addDigits(int num) {

        int sum = 0;

        while (num>0){

            int num2 = num%10;
            sum += num2;
            num = num/10;
        }
        if (sum<10){
            return sum;
        }else {
            return addDigits(sum);
        }
    }

    public static void main(String[] args) {
        Problem_258 problem_258 = new Problem_258();
        int num = 38;
        System.out.println(problem_258.addDigits(num));
    }


//    public static void main(String[] args) {
//
//        int num = 38;
//        int sum = 0;
//
//        while (num>0){
//
//            int num2 = num%10;
//            sum += num2;
//            System.out.println(sum);
//            num = num/10;
//        }

//        if (sum<10){
//             sum;
//        }
//        else{
//             sum;
//        }

//        int num2 = num%10;
//        int num3 = num/10;
//        int num4 = num2+num3;
//        System.out.println(num4);
//        int num5 = num4%10;
//        int num6 = num4/10;
//        int sum = num5 + num6;
//        System.out.println(sum);




//        num = num/10;
////        int num2 = num/10;
//        System.out.println(num2);
//
//        int sum = num + num2;
//
//        System.out.println(sum);

    }
//}
