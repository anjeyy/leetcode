package org.perisic.leetcode.easy;

public class ImplementStrStr {

    /**
     * https://leetcode.com/problems/implement-strstr/
     */

    public static void main(String[] args) {
        System.out.println("### -> " + strStr("hello", "ll"));
        System.out.println("### -> " + strStr("aaaaa", "bba"));
        System.out.println("### -> " + strStr("", ""));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
