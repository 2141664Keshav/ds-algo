package org.cognizant.m_0_intro_to_prob_1.lec_04_arrays_prefix_sum.assignment.q_07_in_place_prefix_sum;

public class Solution {

    public int[] solve(int[] A) {
        for (int i = 1; i < A.length; i++) {
            A[i] += A[i - 1];
        }

        return A;
    }

}
