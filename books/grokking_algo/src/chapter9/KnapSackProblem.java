package chapter9;

import java.util.Arrays;

public class KnapSackProblem {
    public static void main(String[] args) {
        int val[] = new int[]{6, 10, 12};
        int wt[] = new int[]{1, 2, 3};
        int W = 5;
        int n = val.length;
        System.out.println(knapsackDP(wt, val, n, W));
    }

    static int knapsackDP(int[] w, int[] v, int n, int W) {
        if (n <= 0 || W <= 0) {
            return 0;
        }

        int[][] m = new int[n + 1][W + 1];
        for (int j = 0; j <= W; j++) {
            m[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (w[i - 1] > j) {
                    m[i][j] = m[i - 1][j];
                } else {
                    // previous max (value at cell[i-1][j]
                    int case1 = m[i - 1][j];
                    // value of current item + value of remaining space cell[i-1][j-item's weight]
                    int case2 = m[i - 1][j - w[i - 1]] + v[i - 1];
                    m[i][j] = Math.max(case1, case2);
                }
            }
        }
        for(int i=0;i<= n;i++){
            System.out.println(Arrays.toString(m[i]));
        }
        return m[n][W];
    }
}
