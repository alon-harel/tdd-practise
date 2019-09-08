package com.harel;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static List<String> of(String word) {
        List<String> permutations = new ArrayList<>();
        if (word.length() <= 1) {
            permutations.add(word);
        }
        else {
            for (int i = 0; i < word.length(); i++) {
                List<String> of = Permutation.of(dropLetter(word, i));
                for (String s : of) {
                    permutations.add(word.charAt(i) + s);
                }
            }
        }
        return permutations;
    }

    private static String dropLetter(String word, int index) {
        return word.substring(0, index) + word.substring(index + 1);
    }
}
