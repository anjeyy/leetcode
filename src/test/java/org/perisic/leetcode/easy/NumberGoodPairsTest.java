package org.perisic.leetcode.easy;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class NumberGoodPairsTest {

    private final NumberGoodPairs uut = new NumberGoodPairs();


    @ParameterizedTest(name = "array {0} has {1} good pairs")
    @MethodSource("intputWithResultTest")
    void numIdenticalPairsTest(int[] array, int expected) {
        int actual = uut.numIdenticalPairs(array);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> intputWithResultTest() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3, 1, 1, 3}, 4),
            Arguments.of(new int[]{1, 1, 1, 1}, 6),
            Arguments.of(new int[]{1, 2, 3}, 0)
        );
    }
}