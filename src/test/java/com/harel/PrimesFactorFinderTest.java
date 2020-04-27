package com.harel;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PrimesFactorFinderTest {

    private final PrimesFactorFinder primesFactorFinder = new PrimesFactorFinder();

    @Test
    void shouldFindPrimesOf1() {
        assertThat(primesFactorFinder.find(1), is(Collections.singletonList(1)));
    }

    @Test
    void shouldFindPrimesOf2() {
        assertThat(primesFactorFinder.find(2), is(Collections.singletonList(2)));
    }

    @Test
    void shouldFindPrimesOf3() {
        assertThat(primesFactorFinder.find(3), is(Collections.singletonList(3)));
    }

    @Test
    void shouldFindPrimesOf4() {
        assertThat(primesFactorFinder.find(4), is(Arrays.asList(2, 2)));
    }

    @Test
    void shouldFindPrimesOf6() {
        assertThat(primesFactorFinder.find(6), is(Arrays.asList(2, 3)));
    }

    @Test
    void shouldFindPrimesOf7() {
        assertThat(primesFactorFinder.find(7), is(Collections.singletonList(7)));
    }

    @Test
    void shouldFindPrimesOf8() {
        assertThat(primesFactorFinder.find(8), is(Arrays.asList(2, 2, 2)));
    }

    @Test
    void shouldFindPrimesOf9() {
        assertThat(primesFactorFinder.find(9), is(Arrays.asList(3, 3)));
    }

    @Test
    void shouldFindPrimesOf12() {
        assertThat(primesFactorFinder.find(12), is(Arrays.asList(2, 2, 3)));
    }

    @Test
    void shouldFindPrimesOf15() {
        assertThat(primesFactorFinder.find(15), is(Arrays.asList(3, 5)));
    }

    @Test
    void shouldFindPrimesOf4620() {
        assertThat(primesFactorFinder.find(4620), is(Arrays.asList(2, 2, 3, 5, 7, 11)));
    }

    @Test
    void shouldFindPrimesOf4356660() {
        assertThat(primesFactorFinder.find(4356660), is(Arrays.asList(2, 2, 3, 5, 7, 11, 23, 41)));
    }

    @Test
    void shouldFindPrimesOf1024() {
        assertThat(primesFactorFinder.find(1024), is(Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2)));
    }

    @Test
    void shouldFindPrimesOf51() {
        assertThat(primesFactorFinder.find(53), is(Collections.singletonList(53)));
    }

}


