package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem_2974 {
//    Problem 2974. Minimum Number Game

//    public int[] numberGame(int[] nums) {
//
//    }

    public static void main(String[] args) {

        int[] nums = {5,4,2,3};
        int[] nums = {2,5};

        Arrays.sort(nums);

        int aliceCount = nums.length / 2;
        int bobCount = nums.length - aliceCount;

        int[] aliceMoves = new int[aliceCount];
        int[] bobMoves = new int[bobCount];


        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0) {
                bobMoves[i / 2] = nums[i];
            } else {
                aliceMoves[i / 2] = nums[i];
            }
        }

        int[] result = new int[nums.length];

        int index = 0, i = 0, j = 0;
        while (i < aliceMoves.length && j < bobMoves.length) {
            result[index++] = aliceMoves[i++];
            result[index++] = bobMoves[j++];
        }

        while (i < aliceMoves.length) {
            result[index++] = aliceMoves[i++];
        }

        while (j < bobMoves.length) {
            result[index++] = bobMoves[j++];
        }

        for (int num : result) {
            System.out.print(num + " ");
        }


    }
}
