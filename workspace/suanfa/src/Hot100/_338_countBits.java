package Hot100;

public class _338_countBits {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i&(i-1)] + 1;
        }
        return dp;
    }
}
