package org.cognizant.m_1_intro_to_prob_2.lec_01_2d_matrices.additional_problems.q_04_row_sum;

public class Solution {

    public int[] solve(int[][] A) {
        int r = A.length, c = A[0].length;
        int[] answer = new int[r];

        for (int i = 0; i < r; i++) {
            int rowSum = 0;
            for (int j = 0; j < c; j++) {
                rowSum += A[i][j];
            }
            answer[i] = rowSum;
        }

        return answer;
    }

}
