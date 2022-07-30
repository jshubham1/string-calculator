package com.string.calculator;

public class StringCalculator {
    /**
     * String Calculator method which covers the following requirements:
     * 1. Add numbers present in the input, e.g "1,2" = 3
     * 2. Treats empty or null input as zero, e.g "" = 0, null = 0
     * 3. supports different delimiters, e.g "1,2,3", "1 2 3"
     * 4. does not support negative numbers
     * 5. Ignore numbers greater than 100
     *
     * @param input input string, separated by a delimiter ex - 1,2,2,3,4,5
     * @param delimiter delimiter to separate the strings
     * @return sum of the integers based on the conditions
     */
    public int calculateIntegerSum(String input, String delimiter) {
        if (input == null || input.trim().length() == 0) {
            return 0;
        }
        String[] integers = input.split(delimiter);
        int sum = 0;
        for (String integer : integers) {
            try {
                int number = Integer.parseInt(integer.trim());
                if (number > 100 || number < 0) {
                    continue; //ignoring negative numbers and numbers greater than 100
                }
                sum += number;
            } catch (Exception ignored) {
                //Invalid character, ignoring this
            }
        }
        return sum;
    }
}
