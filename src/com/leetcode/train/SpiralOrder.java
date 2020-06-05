package com.leetcode.train;

/**
 * 面试题29 顺时针打印矩阵
 *
 * https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 *
 * @author tailless
 * @since 2020/06/05
 */
public class SpiralOrder {

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, total = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while (true) {
            for (int i = l; i <= r; i++) {
                res[total++] = matrix[t][i];
            }
            if (++t > b) {
                break;
            }
            for (int i = t; i <= b; i++) {
                res[total++] = matrix[i][r];
            }
            if (l > --r) {
                break;
            }
            for (int i = r; i >= l; i--) {
                res[total++] = matrix[b][i];
            }
            if (t > --b) {
                break;
            }
            for (int i = b; i >= t; i--) {
                res[total++] = matrix[i][l];
            }
            if (++l > r) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] ans = spiralOrder(matrix);
        for(int i=0;i<ans.length-1;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println(ans[ans.length-1]);
    }
}
