package org.perisic.leetcode.easy;

import java.util.stream.IntStream;

public class RunningSum1dArray {


    public static void main(String[] args) {

    }


    private static int runningsum(int[] sum) {

        return IntStream.range(0, sum.length)
                        .boxed()
                        .reduce()
            ;
    }
}
