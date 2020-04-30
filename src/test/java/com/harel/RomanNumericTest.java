package com.harel;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RomanNumericTest {

    @Test
    void shouldReturn0ForNoString() {
        assertThat(RomanNumeric.calc(""), is(0));
    }

    @Test
    void shouldReturnValueForSingleLetter() {
        assertThat(RomanNumeric.calc("I"), is(1));
        assertThat(RomanNumeric.calc("V"), is(5));
        assertThat(RomanNumeric.calc("X"), is(10));
        assertThat(RomanNumeric.calc("L"), is(50));
        assertThat(RomanNumeric.calc("C"), is(100));
        assertThat(RomanNumeric.calc("D"), is(500));
        assertThat(RomanNumeric.calc("M"), is(1000));
    }

    @Test
    void shouldReturn2ForII() {
        assertThat(RomanNumeric.calc("II"), is(2));
    }

    @Test
    void shouldReturn3ForIII() {
        assertThat(RomanNumeric.calc("III"), is(3));
    }

    @Test
    void shouldReturn4ForIV() {
        assertThat(RomanNumeric.calc("IV"), is(4));
    }

    @Test
    void shouldReturn14ForXIV() {
        assertThat(RomanNumeric.calc("XIV"), is(14));
    }

    @Test
    void shouldReturn49ForXLIX() {
        assertThat(RomanNumeric.calc("XLIX"), is(49));
    }

    @Test
    void sanityCheck1949ForMCMXLIX() {
        assertThat(RomanNumeric.calc("MCMXLIX"), is(1949));
    }

    @Test
    void sanityCheck2049ForMCMXLIX() {
        assertThat(RomanNumeric.calc("MMXLIX"), is(2049));
    }
}
