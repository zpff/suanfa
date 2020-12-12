package Hot100;

public class _70_climbStairs {
    //动态规划
    public int climbStairs(int n) {
        if(n<2) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
    /*public int climbStairs1(int n) {
        if(n==0||n==1) return 1;
        if (n == 2) return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }*/

    public static void main(String[] args) {
        _70_climbStairs climbStairs = new _70_climbStairs();
        System.out.println(climbStairs.climbStairs(45));
    }
}
