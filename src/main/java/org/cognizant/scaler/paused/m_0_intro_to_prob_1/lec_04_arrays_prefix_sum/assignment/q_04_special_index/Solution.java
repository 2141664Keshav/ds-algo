package org.cognizant.scaler.paused.m_0_intro_to_prob_1.lec_04_arrays_prefix_sum.assignment.q_04_special_index;

public class Solution {

    public int solve(int[] A) {
        int[] pSumEven = createEvenPrefixSumArray(A);
        int[] pSumOdd = createOddPrefixSumArray(A);

        int N = A.length;
        int special_indexes = 0;

        if (pSumEven[N - 1] - pSumEven[0] == pSumOdd[N - 1]) special_indexes++;

        for (int i = 1; i < N; i++) {
            int oddSum = pSumOdd[i - 1] + (pSumEven[N - 1] - pSumEven[i]);
            int evenSum = pSumEven[i - 1] + (pSumOdd[N - 1] - pSumOdd[i]);

            if (oddSum == evenSum) special_indexes++;
        }

        return special_indexes;
    }

    public static int[] createEvenPrefixSumArray(int[] A) {
        int[] pSumEven = new int[A.length];
        pSumEven[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            pSumEven[i] = i % 2 == 0 ? (A[i] + pSumEven[i - 1]) : pSumEven[i - 1];
        }

        return pSumEven;
    }

    public static int[] createOddPrefixSumArray(int[] A) {
        int[] pSumOdd = new int[A.length];
        pSumOdd[0] = 0;

        for (int i = 1; i < A.length; i++) {
            pSumOdd[i] = i % 2 == 1 ? (A[i] + pSumOdd[i - 1]) : pSumOdd[i - 1];
        }

        return pSumOdd;
    }

}
