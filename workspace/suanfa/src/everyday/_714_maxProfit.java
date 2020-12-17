package everyday;

public class _714_maxProfit {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] sell = new int[n];
        int[] buy = new int[n];

        buy[0] = -prices[0];
        sell[0] = 0;

        for (int i = 1; i < n; i++) {
            buy[i] = Math.max(buy[i-1],sell[i-1] - prices[i]);
            sell[i] = Math.max(sell[i-1],buy[i-1] + prices[i] -fee);
        }
        return sell[n-1];
    }
}
