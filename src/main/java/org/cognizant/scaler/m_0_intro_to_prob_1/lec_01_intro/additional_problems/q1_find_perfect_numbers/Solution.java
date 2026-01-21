package org.cognizant.scaler.m_0_intro_to_prob_1.lec_01_intro.additional_problems.q1_find_perfect_numbers;

public class Solution {

    public int solve(int A) {
        if (A == 1) return 0;

        int sumOfDivisors = 1;
        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                if (i == A / i) {
                    sumOfDivisors += i;
                } else {
                    sumOfDivisors += i + (A / i);
                }
            }
        }

        return sumOfDivisors == A ? 1 : 0;
    }
}
