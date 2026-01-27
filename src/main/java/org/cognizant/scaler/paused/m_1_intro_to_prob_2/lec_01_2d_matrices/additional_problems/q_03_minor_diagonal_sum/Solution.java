package org.cognizant.scaler.paused.m_1_intro_to_prob_2.lec_01_2d_matrices.additional_problems.q_03_minor_diagonal_sum;

public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int sum = 0;
        int M = A.length;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (i + j == M - 1) {
                    sum += A[i][j];
                }
            }
        }

        return sum;
    }

}
