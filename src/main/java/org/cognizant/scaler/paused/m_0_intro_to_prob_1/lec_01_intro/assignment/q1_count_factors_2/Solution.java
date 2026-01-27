package org.cognizant.scaler.paused.m_0_intro_to_prob_1.lec_01_intro.assignment.q1_count_factors_2;

public class Solution {

    public int solve(int A) {
        int factors = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if (i == A / i) {
                    factors++;
                } else {
                    factors += 2;
                }
            }
        }

        return factors;
    }
}
