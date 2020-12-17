package Hot100;

import java.util.Arrays;

public class _322_coinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return -1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount + 1);
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0){
                    dp[i] = Math.min(dp[i],dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] == amount+1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        _322_coinChange coinChange = new _322_coinChange();
        coinChange.coinChange(new int[]{186,419,83,408}, 6249);
    }
}
