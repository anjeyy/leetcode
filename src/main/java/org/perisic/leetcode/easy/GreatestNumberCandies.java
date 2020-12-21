package org.perisic.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberCandies {

    /**
     * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
     */

    public static void main(String[] args) {

        int[] candies1 = new int[]{2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        int[] candies2 = new int[]{4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        int[] candies3 = new int[]{12, 1, 12};
        int extraCandies3 = 10;

        System.out.println("### " + kidsWithCandies(candies1, extraCandies1));
        System.out.println("### " + kidsWithCandies(candies2, extraCandies2));
        System.out.println("### " + kidsWithCandies(candies3, extraCandies3));
    }


    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int greatestNumber = greatestNumber(candies);

        List<Boolean> resultList = new ArrayList<>();
        for (int candy : candies) {
            boolean result = candy + extraCandies >= greatestNumber;
            resultList.add(result);
        }
        return resultList;
    }

    private static int greatestNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > result) {
                result = nums[i];
            }
        }
        return result;
    }
}    
