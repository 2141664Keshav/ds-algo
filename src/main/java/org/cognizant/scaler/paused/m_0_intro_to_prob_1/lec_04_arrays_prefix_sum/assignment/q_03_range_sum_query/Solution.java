package org.cognizant.scaler.paused.m_0_intro_to_prob_1.lec_04_arrays_prefix_sum.assignment.q_03_range_sum_query;

public class Solution {

    public long[] rangeSum(int[] A, int[][] B) {
        long[] pSum = createPrefixSumArray(A);
        long[] rangeSumArray = new long[B.length];

        for (int i = 0; i < B.length; i++) {
            int startIndex = B[i][0];
            int endIndex = B[i][1];
            rangeSumArray[i] = startIndex == 0 ? pSum[endIndex] : pSum[endIndex] - pSum[startIndex - 1];
        }

        return rangeSumArray;
    }

    public static long[] createPrefixSumArray(int[] A) {
        long[] pSum = new long[A.length];
        pSum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            pSum[i] = (long) (pSum[i - 1] + A[i]);
        }

        return pSum;
    }

}
