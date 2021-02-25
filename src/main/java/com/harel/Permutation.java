package com.harel;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class Permutation {

    public static List<String> of(String word) {
        if (word.isEmpty()) {
            return emptyList();
        }
        if (word.length() == 1) {
            return singletonList(word);
        } else if (word.length() == 2) {
            return asList(word, String.valueOf(word.charAt(1)) + word.charAt(0));
        } else {
            List<String> permutations = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                Permutation.of(dropLetter(word, i)).forEach(p -> permutations.add(c + p));
            }
            return permutations;
        }
    }

    private static String dropLetter(String word, int position) {
        return word.substring(0, position) + word.substring(position + 1);
    }
}
