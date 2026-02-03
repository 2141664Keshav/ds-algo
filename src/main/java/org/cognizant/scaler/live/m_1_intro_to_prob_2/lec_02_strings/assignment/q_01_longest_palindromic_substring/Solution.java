package org.cognizant.scaler.live.m_1_intro_to_prob_2.lec_02_strings.assignment.q_01_longest_palindromic_substring;

public class Solution {


    public static String longestPalindrome(String A) {
        int[] ans = new int[] { 0, 0 };
        char[] array = A.toCharArray();

        for (int i = 0; i < array.length; i++) {
            expand(i, i, array, ans);
            expand(i, i + 1, array, ans);
        }

        return A.substring(ans[0], ans[1] + 1);
    }

    public static void expand(int si, int ei, char[] array, int[] ans) {

        while (si >= 0 && ei < array.length) {
            if (array[si] != array[ei]) break;
            si--; ei++;
        }

        int startIndex = si + 1, endIndex = ei - 1;
        int length = endIndex - startIndex + 1;
        int prevLength = ans[1] - ans[0] + 1;

        if (length > prevLength) {
            ans[0] = startIndex;
            ans[1] = endIndex;
        }
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abb"));
    }

}
