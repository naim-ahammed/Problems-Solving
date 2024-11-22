package LeetCode;

public class Problem_2798 {
    // https://leetcode.com/problems/number-of-employees-who-met-target/
    // Problem 2798. Number of Employees Who Met Target

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int value=0;

        for (int i = 0; i < hours.length; i++) {
//           System.out.println(hours[i]);

            if((hours[i] >= target)){
//               System.out.println("Met target");
                value++;

//                System.out.println(value);
            }
//           else {
////               System.out.println("Did not meet target");
//           }
        }
        System.out.println(value);
        return value;
    }


    public static void main(String[] args) {

       int[]  hours = {0,1,2,3,4};
        int target = 2;

        Problem_2798 problem = new Problem_2798();
        problem.numberOfEmployeesWhoMetTarget(hours, target);


    }
}
