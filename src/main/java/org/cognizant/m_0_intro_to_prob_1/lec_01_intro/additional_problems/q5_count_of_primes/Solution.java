package org.cognizant.m_0_intro_to_prob_1.lec_01_intro.additional_problems.q5_count_of_primes;

public class Solution {

    public int solve(int A) {
        int totalPrimeNumbers = 0;

        for (int i = 2; i <= A; i++) {
            if (isPrime(i)) totalPrimeNumbers++;
        }

        return totalPrimeNumbers;
    }

    public static boolean isPrime(int N) {
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }
}
