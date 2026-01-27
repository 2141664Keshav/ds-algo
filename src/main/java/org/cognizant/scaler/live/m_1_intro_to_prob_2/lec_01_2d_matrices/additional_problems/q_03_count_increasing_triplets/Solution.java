package org.cognizant.scaler.live.m_1_intro_to_prob_2.lec_01_2d_matrices.additional_problems.q_03_count_increasing_triplets;

public class Solution {

    public int solve(int[] A) {
        // Trying Brute Force Approach
        int N = A.length;
        int triplets = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A[i] < A[j] && A[j] < A[k]) triplets++;
                }
            }
        }

        return triplets;
    }

}
