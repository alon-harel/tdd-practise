package com.harel;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;

/*
https://www.codeproject.com/Articles/498404/TDD-the-Anagrams-Kata
Write a program to generate all potential anagrams of an input string.
For example, the potential anagrams of "biro" are
biro bior brio broi boir bori
ibro ibor irbo irob iobr iorb
rbio rboi ribo riob roib robi
obir obri oibr oirb orbi orib
 */
class PermutationTest {

    @Test
    void shouldReturnEmptyListWhenEmptyString() {
        assertThat(Permutation.of(""), empty());
    }

    @Test
    void permutationsOfOneLetter() {
        assertThat(Permutation.of("a"), containsInAnyOrder("a"));
    }

    @Test
    void permutationsOfTwoLetter() {
        assertThat(Permutation.of("ab"), containsInAnyOrder("ab", "ba"));
    }

    @Test
    void permutationsOfThreeLetter() {
        assertThat(Permutation.of("abc"), containsInAnyOrder(
            "abc", "acb",
            "bac",
            "bca",
            "cab",
            "cba"));
    }

    @Test
    void permutationsOfFourLetter() {
        List<String> permutations = Permutation.of("abcd");
        Set<String> uniqueWords = new HashSet<>(permutations);
        assertThat(uniqueWords, hasSize(24));
    }

    @Test
    void permutationsOfFiveLetter() {
        List<String> permutations = Permutation.of("abcde");
        Set<String> uniqueWords = new HashSet<>(permutations);
        assertThat(uniqueWords, hasSize(120));
    }
}
