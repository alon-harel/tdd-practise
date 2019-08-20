package com.harel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimesFactorFinder {
    public List<Integer> find(int number) {
        if (number == 1) {
            return Collections.singletonList(1);
        }
        else {
            List<Integer> primes = new ArrayList<>();
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    primes.add(i);
                    if (number / i > 1) {
                        primes.addAll(find(number / i));
                        break;
                    }
                }
                else if (i > Math.sqrt(number)) {
                    primes.add(number);
                    break;
                }
            }

            return primes;
        }
    }
}

