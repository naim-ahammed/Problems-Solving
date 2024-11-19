package LeetCode;

import java.util.HashMap;
import java.util.Map;

//Problem 1.Two Sum

public class Problem_1 {
    public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0;; ++i) {
                int x = nums[i];
                int y = target - x;
                if (map.containsKey(y)) {
                    return new int[] {
                            map.get(y), i
                    };
                }
                map.put(x, i);
            }
        }

        public static void main(String[] args) {
            Problem_1 solution = new Problem_1();
            int[] nums = {2, 7, 11, 15};
            int target = 9;
            int[] result = solution.twoSum(nums, target);
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }




//leetCode problem solution in function

//  package LeetCode;
//
//public class Solution {
//
//    public int addDigits(int num) {
//
//        int sum = 0;
//
//        while (num>0){
//
//            int num2 = num%10;
//            sum += num2;
//            num = num/10;
//        }
//        if (sum<10){
//            return sum;
//        }else {
//            return addDigits(sum);
//        }
//    }
//}


//    package LeetCode;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Solution solution = new Solution();
//
//        System.out.println(solution.addDigits(38));
//
//    }
//}