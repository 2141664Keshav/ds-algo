package org.cognizant.scaler.additional_problems.q_02_add_the_matrices;

public class Solution {

    public int[][] solve(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] += B[i][j];
            }
        }

        return A;
    }

}
