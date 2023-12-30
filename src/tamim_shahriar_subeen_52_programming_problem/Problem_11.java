package tamim_shahriar_subeen_52_programming_problem;

import java.util.Scanner;

public class Problem_11 {
    //factorial

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j,m;

        i = scanner.nextInt();

        for (int k = 1; k <= i; k++) {
            int n = scanner.nextInt();
            long  factor = 1;

            for ( int l = 2; l <=n ; l++) {
                factor = factor * l;
            }

            System.out.println(factor);
        }


    }

}
