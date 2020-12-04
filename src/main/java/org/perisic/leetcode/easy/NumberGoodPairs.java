package org.perisic.leetcode.easy;


public class NumberGoodPairs {

    /**
     * https://leetcode.com/problems/number-of-good-pairs/
     */

    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3, 1, 1, 3};
        int[] nums2 = new int[]{1, 1, 1, 1};
        int[] nums3 = new int[]{1, 2, 3};

        System.out.println("### " + numIdenticalPairs(nums1));
        System.out.println("### " + numIdenticalPairs(nums2));
        System.out.println("### " + numIdenticalPairs(nums3));
    }

    private static int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }


}    
