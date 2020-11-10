package org.perisic.leetcode.easy;

import java.util.Arrays;

public class RunningSum1dArray {

    /**
     * https://leetcode.com/problems/running-sum-of-1d-array/
     */

    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3, 4};
        int[] nums2 = new int[]{1, 1, 1, 1, 1};
        int[] nums3 = new int[]{3, 1, 2, 10, 1};

        System.out.println("## " + Arrays.toString(runningSum(nums1)));
        System.out.println("## " + Arrays.toString(runningSum(nums2)));
        System.out.println("## " + Arrays.toString(runningSum(nums3)));
    }


    private static int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int tmp = 0;
            for (int j = 0; j <= i; j++) {
                tmp = tmp + nums[j];
            }
            result[i] = tmp;
        }
        return result;
    }
}
