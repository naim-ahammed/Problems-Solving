package tamim_shahriar_subeen_52_programming_problem;

//even odd 1
import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t,n;

        t = sc.nextInt();

        for (int i=0; i<=t; i++){
            n = sc.nextInt();

            if (n%2==0){
                System.out.println("even");
            } else{
                System.out.println("odd");
            }
        }

    }
}
