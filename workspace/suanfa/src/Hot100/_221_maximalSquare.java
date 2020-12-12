package Hot100;

import java.util.PriorityQueue;

public class _221_maximalSquare {
    //暴力
    /*public int maximalSquare(char[][] matrix) {
        int maxSize = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == '1'){
                    int currentMaxSize = Math.min(matrix.length-i,matrix[0].length-j);
                    maxSize = Math.max(maxSize,1);
                    for (int k = 1; k < currentMaxSize; k++) {
                        boolean flag = true;
                        if (matrix[i+k][j+k] == '0'){
                            break;
                        }
                        for (int m = 0; m < k; m++) {
                            if (matrix[i+m][j+k] == '0'||matrix[i+k][j+m] == '0'){
                                flag = false;
                                break;
                            }
                        }
                        if (flag){
                            maxSize = Math.max(maxSize,k+1);
                        }else {
                            break;
                        }
                    }
                }
            }
        }
        int maxSquare = maxSize * maxSize;
        return maxSquare;
    }*/
    //动态规划
    public int maximalSquare(char[][] matrix) {
        int maxSize = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == '1'){
                    if (i == 0|| j == 0){
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    }
                }
                maxSize = Math.max(maxSize,dp[i][j]);
            }
        }
        int maxSquare = maxSize * maxSize;
        return maxSquare;
    }
}
