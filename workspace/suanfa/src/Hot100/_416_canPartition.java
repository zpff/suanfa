package Hot100;

public class _416_canPartition {
    public boolean canPartition(int[] nums) {
        int numSum = 0;
        int numMax = 0;
        for (int i = 0; i < nums.length; i++) {
            numSum+= nums[i];
            numMax = Math.max(nums[i],numMax);
        }
        if (numSum %2 != 0) return false;

        int capcity = numSum/2;
        if (numMax > capcity) return false;

        int n = nums.length;
        boolean[][] dp = new boolean[n][capcity +1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >= nums[i]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][capcity];
    }
}
