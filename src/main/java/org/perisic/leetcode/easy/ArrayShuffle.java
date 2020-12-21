package org.perisic.leetcode.easy;

import java.util.Arrays;

public class ArrayShuffle {

    /**
     * https://leetcode.com/problems/shuffle-the-array/
     */

    public static void main(String[] args) {

        int[] nums1 = new int[]{2, 5, 1, 3, 4, 7};
        int n1 = 3;
        int[] nums2 = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        int[] nums3 = new int[]{1, 1, 2, 2};
        int n3 = 2;

        System.out.println("### " + Arrays.toString(shuffle(nums1, n1)));
        System.out.println("### " + Arrays.toString(shuffle(nums2, n2)));
        System.out.println("### " + Arrays.toString(shuffle(nums3, n3)));
    }


    private static int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];
        for (int i = 0; i < 2 * n; i = i + 2) {

            result[i] = nums[i - i / 2];
            result[i + 1] = nums[n + i / 2];
        }

        return result;
    }
    

}    
