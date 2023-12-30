package tamim_shahriar_subeen_52_programming_problem;

import java.util.Scanner;

public class Problem_10 {

    // Run Rate
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j;
        double r1,r2,b;

        int boll = 6;
        int over = 50;
        int totalBall = over*boll;

        i = scanner.nextInt();

        for (int k = 1; k <= i; k++) {

            r1 = scanner.nextInt();
            r2 = scanner.nextInt();
            b = scanner.nextInt();

//            double team1 = r1 / over;
//            System.out.println(team1);
//
//            double team2 = r2 / over;
//            System.out.println(team2);

            double overRunRate = r2/((totalBall-b)/boll);

            double runrate = (((r1+1)-r2)/b)*boll;

            System.out.println(String.format("%.2f",overRunRate)+" "+String.format("%.2f",runrate));



//input - output
//            4

//            300 294 6
//            6.00 7.00

//            200 100 100
//            3.00 6.06

//            333 250 40
//            5.77 12.60

//            118 100 180
//            5.00 0.63




        }
    }
}
