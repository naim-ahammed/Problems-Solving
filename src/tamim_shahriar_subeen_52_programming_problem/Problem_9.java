package tamim_shahriar_subeen_52_programming_problem;

import java.util.Scanner;

import static java.lang.Math.floor;

public class Problem_9 {

    //sqrt number yes or not print

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i,j,n;

        i = scanner.nextInt();

        for (int k = 1; k <= i; k++) {

            n = scanner.nextInt();

           double sqrt =   Math.sqrt(n);
            if(Math.ceil(sqrt)==floor(sqrt)){

                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

    }


}}
