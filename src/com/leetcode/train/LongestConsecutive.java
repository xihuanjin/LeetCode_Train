package com.leetcode.train;

import java.util.HashSet;

/**
 * 128. 最长连续序列
 *
 * https://leetcode-cn.com/problems/longest-consecutive-sequence/
 *
 * @author tailless
 * @since 2020/06/06
 */
public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> num_set = new HashSet<>();
        int ans = 0;
        for (int num : nums) {
            num_set.add(num);
        }
        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentConsecutive = 1;
                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentConsecutive += 1;
                }
                ans = Math.max(ans, currentConsecutive);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
