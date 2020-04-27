package com.harel;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PrimesFactorFinderTest2 {

    @Test
    void shouldFindPrimes() {
        assertThat(new PrimesFactorFinder2().primesFactorsOf(1), is(Collections.emptyList()));
        assertThat(new PrimesFactorFinder2().primesFactorsOf(2), is(Collections.singletonList(2)));
        assertThat(new PrimesFactorFinder2().primesFactorsOf(3), is(Collections.singletonList(3)));
        assertThat(new PrimesFactorFinder2().primesFactorsOf(4), is(Arrays.asList(2, 2)));
        assertThat(new PrimesFactorFinder2().primesFactorsOf(5), is(Collections.singletonList(5)));
        assertThat(new PrimesFactorFinder2().primesFactorsOf(6), is(Arrays.asList(2, 3)));
        assertThat(new PrimesFactorFinder2().primesFactorsOf(7), is(Collections.singletonList(7)));
        assertThat(new PrimesFactorFinder2().primesFactorsOf(8), is(Arrays.asList(2, 2, 2)));
        assertThat(new PrimesFactorFinder2().primesFactorsOf(9), is(Arrays.asList(3, 3)));
        assertThat(new PrimesFactorFinder2().primesFactorsOf(2 * 2 * 3 * 7 * 11 * 17),
                is(Arrays.asList(2, 2, 3, 7, 11, 17)));
    }

    class PrimesFactorFinder2 {
        List<Integer> primesFactorsOf(int n) {
            List<Integer> factors = new ArrayList<>();
            if (n > 1) {
                int divider = 2;
                while (n > 1) {
                    while (n % divider == 0) {
                        factors.add(divider);
                        n = n / divider;
                    }
                    divider++;
                }
            }

            return factors;
        }
    }
}
