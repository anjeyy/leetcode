package org.perisic.leetcode.easy;

/**
 * https://leetcode.com/problems/number-of-good-pairs/
 */
class NumberGoodPairs {

    int numIdenticalPairs(int[] nums) {
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
