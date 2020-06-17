package com.leetcode.train;

/**
 * 1014. 最佳观光组合
 *
 * https://leetcode-cn.com/problems/best-sightseeing-pair/
 *
 * @author tailless
 * @since 2020/06/17
 */
public class MaxScoreSightseeingPair {
    public static int maxScoreSightseeingPair(int[] A) {
        int ans = 0;
        int mx = A[0] + 0;
        for (int i = 1; i < A.length; i++) {
            ans = Math.max(ans,mx+A[i]-i);
            mx = Math.max(mx,A[i]+i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {8,1,5,2,6};
        System.out.println(maxScoreSightseeingPair(A));
    }
}
