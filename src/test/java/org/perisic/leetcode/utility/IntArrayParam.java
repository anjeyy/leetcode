package org.perisic.leetcode.utility;


import java.util.Arrays;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.TypedArgumentConverter;

public class IntArrayParam extends TypedArgumentConverter<String, int[]> {

    protected IntArrayParam() {
        super(String.class, int[].class);
    }

    @Override
    protected int[] convert(String source) throws ArgumentConversionException {
        String[] splittedNumber = source.split(",");
        return Arrays.stream(splittedNumber)
                     .map(String::trim)
                     .mapToInt(Integer::parseInt)
                     .toArray();
    }
}
