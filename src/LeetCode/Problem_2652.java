package LeetCode;

public class Problem_2652 {


    // 2652. Sum Multiples

//    public int sumOfMultiples(int n) {
//
//    }

    public static void main(String[] args) {


        int n = 7;

        int len = 0;

        for (int i = 1; i <=n; i++) {
            if (i%3==0 || i%5==0 || i%7==0) {

                len +=i;


            }
        }
        System.out.println(len);





    }
}
