package com.harel;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

/*
Write a program to generate all potential anagrams of an input string.
For example, the potential anagrams of "biro" are
biro bior brio broi boir bori
ibro ibor irbo irob iobr iorb
rbio rboi ribo riob roib robi
obir obri oibr oirb orbi orib
 */
class PermutationTest {

    @Test
    void permutationOfBlankIsCollectionWithBlank() {
        assertThat(Permutation.of(""), is(Collections.singletonList("")));
    }

    @Test
    void permutationOfOneLetterIsCollectionWithTheLetter() {
        assertThat(Permutation.of("a"), is(Collections.singletonList("a")));
    }

    @Test
    void permutationOfTwoLetters() {
        assertThat(Permutation.of("ab"), is(Arrays.asList("ab", "ba")));
    }

    @Test
    void permutationOfThreeLetters() {
        assertThat(Permutation.of("abc"), is(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")));
    }

    @Test
    void permutationOfFourLetters() {
        verify("abcd", 24);
    }

    private void verify(String word, int count) {
        Set<String> permutations = new HashSet<>(Permutation.of(word));
        assertThat(new HashSet<>(permutations).size(), is(count));
        permutations.forEach(phrase -> {
            for (int i = 0; i < phrase.length(); i++) {
                assertThat(phrase, containsString(Character.toString(word.charAt(i))));
            }
        });
    }

    @Test
    void permutationOfFiveLetters() {
        verify("abcde", 120);
    }

    @Test
    void permutationOfSixLetters() {
        verify("abcdef", 120 * 6);
    }
}
