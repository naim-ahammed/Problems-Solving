package tamim_shahriar_subeen_programming_problem_52;

import java.util.Scanner;

// divisor
public class Problem_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j,t, n;

        t = sc.nextInt();

        for (i=1; i<=t; i++){
            n = sc.nextInt();
            System.out.print("Case "+i+":");
            for (j=1; j<=n; j++){
                if(n%j==0){
                    System.out.print(" "+j);
                }
            }
            System.out.println();

        }



    }
}
