package org.cognizant.scaler.live.m_1_intro_to_prob_2.lec_02_strings.additional_problems.q_03_isAlNum;

public class Solution {

    public int solve(char[] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            char letter = A[i];
            boolean isAlNum = (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') || (letter >= '0' && letter <= '9');
            if (!isAlNum) return 0;
        }

        return 1;
    }

}
