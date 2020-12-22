package org.perisic.leetcode.easy;

public class StepsReducingToZero {

    /**
     * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
     */

    public static void main(String[] args) {

        int num1 = 14;
        int num2 = 8;
        int num3 = 123;

        System.out.println("## " + numberOfSteps(num1));
        System.out.println("## " + numberOfSteps(num2));
        System.out.println("## " + numberOfSteps(num3));
    }


    private static int numberOfSteps(int num) {

        int counter = 0;
        while (num != 0) {
            num = (num % 2 == 0) ? num / 2 : --num;
            counter++;
        }

        return counter;
    }
}
