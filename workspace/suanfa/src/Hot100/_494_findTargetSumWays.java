package Hot100;

public class _494_findTargetSumWays {
    public int findTargetSumWays(int[] nums, int S) {
        int n = nums.length;
        int[][] dp = new int[n][2001];
        dp[0][nums[0] + 1000] = 1;
        dp[0][-nums[0] + 1000] +=1;
        for (int i = 1; i < n; i++) {
            for (int sum = -1000; sum <=1000 ; sum++) {
                if (dp[i-1][sum + 1000] > 0){
                    dp[i][sum + nums[i] + 1000] += dp[i - 1][sum + 1000];
                    dp[i][sum - nums[i] + 1000] += dp[i - 1][sum + 1000];
                }
            }
        }
        return S > 1000 ? 0 : dp[n -1][S + 1000];
    }
}
