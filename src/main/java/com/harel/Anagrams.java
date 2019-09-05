package com.harel;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {
    public List<String> find(String word) {
        List<String> anagrams = new ArrayList<>();
        if (word.length() <= 1) {
            anagrams.add(word);
        }
        else {
            for (int index = 0; index < word.length(); index++) {
                List<String> angrams = find(dropLetter(word, index));
                for (String angram : angrams) {
                    anagrams.add(word.charAt(index) + angram);
                }
            }
        }
        return anagrams;
    }

    private String dropLetter(String word, int index) {
        return word.substring(0, index) + word.substring(index + 1);
    }
}
