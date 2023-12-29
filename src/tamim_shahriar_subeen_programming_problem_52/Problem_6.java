package tamim_shahriar_subeen_programming_problem_52;


import java.util.Scanner;

// input 5 number print frist and last number sum
//        input--output
//        5
//        12345 sum = 6
//        56789 sum = 14
//        14310 sum = 1
//        10062 Sum = 3
//        96587 Sum = 16


public class Problem_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j,t, n;

        t = sc.nextInt();

        for (t=1; t<=5; t++){
            n = sc.nextInt();

            int k =n%10;

             n = n/10;//1234
            int l = n%10;//4

            n=n/10;//123
            int m =n%10;//3

            n = n/10;//12
            int p = n%10;//2

            n=n/10;//1
            int r =n%10;//1



            System.out.println("Last number = "+k);

            System.out.println("Frist number = "+r);

            int sum = 0;
            sum = k+r;

            System.out.println("Sum = "+sum);
            System.out.println();


        }


    }
}