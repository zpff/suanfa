package Hot100;

public class _123_maxProfit {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][4];


        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = -prices[0];//3,3,5,0,0,3,1,4
        dp[0][3] = 0;

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(-prices[i],dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i-1 ][0] + prices[i],dp[i-1][1]);
            dp[i][2] = Math.max(dp[i -1][1] - prices[i],dp[i - 1][2]);
            dp[i][3] = Math.max(dp[i - 1][2] + prices[i],dp[i - 1][3]);
        }
        return dp[n-1][3];
    }
    /*public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][5];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        dp[0][3] = -prices[0];
        dp[0][4] = 0;

        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0];
            dp[i][1] = Math.max(dp[i -1][0] - prices[i],dp[i - 1][1]);
            dp[i][2] = Math.max(dp[i-1 ][1] + prices[i],dp[i-1][2]);
            dp[i][3] = Math.max(dp[i -1][2] - prices[i],dp[i - 1][3]);
            dp[i][4] = Math.max(dp[i - 1][3] + prices[i],dp[i - 1][4]);
        }
        return Math.max(dp[n-1][2],dp[n-1][4]);
    }*/
    public static void main(String[] args) {
        _123_maxProfit maxProfit = new _123_maxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }
}
