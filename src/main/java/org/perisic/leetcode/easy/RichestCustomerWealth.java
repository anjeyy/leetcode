package org.perisic.leetcode.easy;

import java.util.Arrays;


public class RichestCustomerWealth {

    /**
     * https://leetcode.com/problems/richest-customer-wealth/
     */

    public static void main(String[] args) {

        int[][] nums1 = new int[][]{new int[]{1, 2, 3}, new int[]{3, 2, 1}};
        int[][] nums2 = new int[][]{new int[]{1, 5}, new int[]{7, 3}, new int[]{3, 5}};
        int[][] nums3 = new int[][]{new int[]{2, 8, 7}, new int[]{7, 1, 3}, new int[]{1, 9, 5}};

        System.out.println("### " + maximumWealth(nums1));
        System.out.println("### " + maximumWealth(nums2));
        System.out.println("### " + maximumWealth(nums3));

        System.out.println("### " + maximumWealthStreams(nums1));
        System.out.println("### " + maximumWealthStreams(nums2));
        System.out.println("### " + maximumWealthStreams(nums3));
    }

    private static int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++) {
            int tmp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                tmp = tmp + accounts[i][j];
            }
            if (tmp > result) {
                result = tmp;
            }
        }
        return result;
    }

    private static int maximumWealthStreams(int[][] accounts) {
        return Arrays.stream(accounts)
                     .mapToInt(arr -> Arrays.stream(arr).sum()).max()
                     .orElse(0);
    }


}    
