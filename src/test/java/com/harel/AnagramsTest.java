package com.harel;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/*
Write a program to generate all potential anagrams of an input string.
For example, the potential anagrams of "biro" are
biro bior brio broi boir bori
ibro ibor irbo irob iobr iorb
rbio rboi ribo riob roib robi
obir obri oibr oirb orbi orib
 */
class AnagramsTest {

    private Anagrams anagrams = new Anagrams();


    @Test
    void returnEmptyListForEmptyString() {
        assertThat(anagrams.find(""), is(Collections.singletonList("")));
    }

    @Test
    void singleLetterReturnsArrayWithThisLetter() {
        assertThat(anagrams.find("a"), is(Collections.singletonList("a")));
    }

    @Test
    void handleTwoLettersWord() {
        assertThat(anagrams.find("ab"), is(Arrays.asList("ab", "ba")));
    }

    @Test
    void handleThreeLettersWord() {
        assertThat(anagrams.find("abc"), is(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")));
    }

    @Test
    void handleFourLettersWord() {
        assertThat(new HashSet<>(anagrams.find("biro")), is(new HashSet<>(Arrays.asList("biro", "bior", "brio", "broi", "boir", "bori",
                "ibro", "ibor", "irbo", "irob", "iobr", "iorb",
                "rbio", "rboi", "ribo", "riob", "roib", "robi",
                "obir", "obri", "oibr", "oirb", "orbi", "orib"))));
    }

    @Test
    void verify6AngramsLength() {
        assertThat(new HashSet<>(anagrams.find("abcdef")).size(), is(6 * 5 * 4 * 3 * 2));
    }
}
