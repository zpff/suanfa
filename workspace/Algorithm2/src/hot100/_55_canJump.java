package hot100;

public class _55_canJump {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 1; i < dp.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (dp[j]  && i - j <= nums[j]){
                    dp[i] = true;
                }
            }
        }
        return dp[nums.length -1];
    }
}
