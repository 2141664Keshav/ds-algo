package org.cognizant.scaler.paused.m_1_intro_to_prob_2.lec_01_2d_matrices.additional_problems.q_01_matrix_scalar_product;

public class Solution {

    public int[][] solve(int[][] A, int B) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] *= B;
            }
        }

        return A;
    }

}
