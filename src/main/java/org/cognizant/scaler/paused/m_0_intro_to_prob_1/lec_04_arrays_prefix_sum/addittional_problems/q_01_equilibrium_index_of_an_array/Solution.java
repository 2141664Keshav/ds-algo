package org.cognizant.scaler.paused.m_0_intro_to_prob_1.lec_04_arrays_prefix_sum.addittional_problems.q_01_equilibrium_index_of_an_array;

public class Solution {

    public int solve(int[] A) {
        int N = A.length;
        createPrefixSumArray(A);

        for (int i = 0; i < N; i++) {
            int leftSum = 0, rightSum = A[N - 1] - A[i];

            if (i > 0) leftSum = A[i - 1];

            if (leftSum == rightSum) return i;
        }

        return -1;
    }

    public static void createPrefixSumArray(int[] A) {
        for (int i = 1; i < A.length; i++) {
            A[i] += A[i - 1];
        }
    }

}
