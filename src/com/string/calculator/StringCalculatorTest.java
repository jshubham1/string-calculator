package com.string.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void shouldReturnSumForCommaSeparatedString() {
        String input = "1,2,3,4,5";
        String delimiter = ",";
        int expectedSum = 15;
        int resultSum = stringCalculator.calculateIntegerSum(input, delimiter);
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldReturnSumForHyphenSeparatedString() {
        String input = "1-2-3-4-5";
        String delimiter = "-";
        int expectedSum = 15;
        int resultSum = stringCalculator.calculateIntegerSum(input, delimiter);
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldReturnSumForSpaceSeparatedString() {
        String input = "1 2 3 4 5";
        String delimiter = " ";
        int expectedSum = 15;
        int resultSum = stringCalculator.calculateIntegerSum(input, delimiter);
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldReturnSumByIgnoringNonIntegerCharacters() {
        String input = "1,2,3,4,5,6,7A,8B,Shubham";
        String delimiter = ",";
        int expectedSum = 21;
        int resultSum = stringCalculator.calculateIntegerSum(input, delimiter);
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldReturnSumByIgnoringIntegersGreaterThan100() {
        String input = "1,2,3,4,5,100";
        String delimiter = ",";
        int expectedSum = 15;
        int resultSum = stringCalculator.calculateIntegerSum(input, delimiter);
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldReturnSumByIgnoringIntegersLessThan0() {
        String input = "1,2,3,4,5,-1,-2,-3";
        String delimiter = " ";
        int expectedSum = 15;
        int resultSum = stringCalculator.calculateIntegerSum(input, delimiter);
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldReturn0WhenEmptySpaceIsPassed() {
        String input = "";
        String delimiter = "";
        int expectedSum = 0;
        int resultSum = stringCalculator.calculateIntegerSum(input, delimiter);
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldReturn0WhenNullIsPassed() {
        String delimiter = "";
        int expectedSum = 0;
        int resultSum = stringCalculator.calculateIntegerSum(null, delimiter);
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldReturn0WhenNonIntegerValuesArePassed() {
        String input = "Hi, this, string, doesn't, contain ,any,  integers";
        String delimiter = ",";
        int expectedSum = 0;
        int resultSum = stringCalculator.calculateIntegerSum(input, delimiter);
        Assertions.assertEquals(expectedSum, resultSum);
    }
}