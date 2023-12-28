package tamim_shahriar_subeen_programming_problem_52;


import java.util.Scanner;

// input any number print * row and colum
public class Problem_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j,t, n;

        t = sc.nextInt();

        for (i=1; i<=t; i++){
            n = sc.nextInt();

            for (j=1; j<=n; j++){

                for (int k=1; k<=n; k++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }


    }
}