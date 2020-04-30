package com.harel;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeric {

    private final static Map<String, Integer> ROMAN_TO_NUMERIC = new HashMap<String, Integer>() {{
        put("i", 1);
        put("v", 5);
        put("x", 10);
        put("l", 50);
        put("c", 100);
        put("d", 500);
        put("m", 1000);
    }};

    public static int calc(String romanNumeric) {
        if (romanNumeric.isEmpty()) {
            return 0;
        } else if (romanNumeric.length() == 1) {
            return ROMAN_TO_NUMERIC.get(romanNumeric.toLowerCase());
        } else {
            int firstLetterValue = firstLetterValue(romanNumeric);
            int secondLetterValue = secondLetterValue(romanNumeric);
            if (secondLetterValue > firstLetterValue) {
                return secondLetterValue - firstLetterValue + calc(romanNumeric.substring(2));
            } else {
                return firstLetterValue + calc(romanNumeric.substring(1));
            }
        }
    }

    private static int firstLetterValue(String romanNumeric) {
        String firstLetter = romanNumeric.substring(0, 1).toLowerCase();
        return ROMAN_TO_NUMERIC.get(firstLetter);
    }

    private static int secondLetterValue(String romanNumeric) {
        String secondLetter = romanNumeric.substring(1, 2).toLowerCase();
        return ROMAN_TO_NUMERIC.get(secondLetter);
    }

    private static boolean nineRepresentation(String firstLetter, String secondLetter) {
        return ROMAN_TO_NUMERIC.get(secondLetter) > ROMAN_TO_NUMERIC.get(firstLetter);
    }
}
