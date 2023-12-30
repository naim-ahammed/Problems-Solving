package tamim_shahriar_subeen_52_programming_problem;

import java.util.Scanner;

public class Problem_8 {
    //3 number input and smaller to bigger code in java
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i,j,n = 0, n1,n2,n3;

        i = scanner.nextInt();

        for (int k = 1; k <= i; k++) {

            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            n3 = scanner.nextInt();

            System.out.print("Case "+k+": ");


            if(n1<n2){
                if (n1<n3){
                    if(n2<n3){
                        System.out.println(n1+" "+n2+" "+n3);
                    }
                    else{
                        System.out.println(n1+" "+n3+" "+n2);
                    }
                }
                else{
                    System.out.println(n3+" "+n1+" "+n2);

                }
            }

            else{

                    if (n2<n3){
                        if(n1<n3){
                            System.out.println(n2+" "+n1+" "+n3);
                        }
                        else{
                            System.out.println(n2+" "+n3+" "+n1);
                        }
                    }
                    else{
                        System.out.println(n3+" "+n2+" "+n1);

                    }

            }





//            if(n2>n1 && n1<n3){
//                System.out.println("N1 = "+n1);
//            }
//            if(n1>n2 || n2<n3){
//                System.out.println("N2 = "+n2);
//            }

//
//            if(n1 <= n2 || n1 <= n3){
//                System.out.println("N1 = "+n1);
//            }
//            if(n2 <= n1 || n2 <= n3){
//                System.out.println("N2 = "+n2);
//            }
//            if(n3 >= n1 && n3 >= n2){
//                System.out.println("N3 = "+n3);
//            }





//            System.out.println(n1+" "+n2+" "+n3);


//            for (int l = 0; l < 3; l++) {
//                n = scanner.nextInt();
//                System.out.print(n);
//
//            }

        }

    }
}
