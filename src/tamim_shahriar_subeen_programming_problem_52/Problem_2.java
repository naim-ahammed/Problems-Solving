package tamim_shahriar_subeen_programming_problem_52;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t;
        char n;

        t = sc.nextInt();

        for (int i=0; i<=t; i++){
            n = sc.next().charAt(101);

                if (n%2==0){

                    System.out.println("even");
                } else{
                    System.out.println("odd");
                }


        }

    }
}