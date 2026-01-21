package org.cognizant.scaler.m_0_intro_to_prob_1.lec_01_intro.assignment.q2_isPrime;

public class Solution {

    public int solve(int A) {
        if (A == 1) return 0;

        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) return 0;
        }

        return 1;
    }
}
