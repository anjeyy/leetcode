package org.perisic.leetcode.easy;

import java.util.Arrays;

public class CountSmallerNumbers {

    /**
     * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
     */

    public static void main(String[] args) {

        int[] nums1 = new int[]{8, 1, 2, 2, 3};
        int[] nums2 = new int[]{6, 5, 4, 8};
        int[] nums3 = new int[]{7, 7, 7, 7};

        System.out.println("## " + Arrays.toString(smallerNumbersThanCurrent(nums1)));
        System.out.println("## " + Arrays.toString(smallerNumbersThanCurrent(nums2)));
        System.out.println("## " + Arrays.toString(smallerNumbersThanCurrent(nums3)));
    }


    private static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i] && j != i) {
                    counter++;
                }
            }
            result[i] = counter;
        }

        return result;
    }
}
