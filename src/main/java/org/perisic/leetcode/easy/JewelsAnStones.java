package org.perisic.leetcode.easy;

public class JewelsAnStones {

    /**
     * https://leetcode.com/problems/jewels-and-stones/
     */

    public static void main(String[] args) {

        String jewels1 = "aA", stones1 = "aAAbbbb";
        String jewels2 = "z", stones2 = "ZZ";

        System.out.println("## " + numJewelsInStones(jewels1, stones1));
        System.out.println("## " + numJewelsInStones(jewels2, stones2));
    }


    private static int numJewelsInStones(String J, String S) {

        int counter = 0;
        for (int i = 0; i < S.length(); i++) {
            char currentStone = S.charAt(i);
            for (int j = 0; j < J.length(); j++) {
                if (J.charAt(j) == currentStone) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
