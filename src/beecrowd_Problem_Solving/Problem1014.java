package beecrowd_Problem_Solving;

import java.io.IOException;
import java.util.Scanner;

public class Problem1014 {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        float Y = sc.nextFloat();

        double km = 0.000;
        km = X/Y;

        System.out.println(String.format("%.3f",km )+" km/l");

    }
}