package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem_75 {

    // 75. Sort Colors

    public void sortColors(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        Problem_75 problem = new Problem_75();
        problem.sortColors(nums);

    }
}
