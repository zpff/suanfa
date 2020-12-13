package Hot100;

public class _309_maxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];

        buy[0] = -prices[0];
        sell[0] = 0;

        buy[1] = Math.max(-prices[1],buy[0]);
        sell[1] = Math.max(sell[0],buy[0] + prices[1]);

        for (int i = 2; i < prices.length; i++) {
            buy[i] = Math.max(sell[i - 2] - prices[i],buy[i -1]);
            sell[i] = Math.max(buy[i - 1] + prices[i],sell[i-1]);
        }
        return sell[prices.length - 1];
    }
}
