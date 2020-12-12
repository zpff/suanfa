package Hot100;

public class _53_maxSubArray {
    /*public int maxSubArray(int[] nums) {
    //用一个int型来保存最大和
        int ans = nums[0];
        //用sum来保存当前和
        int sum = 0;
        //对数组进行遍历
        for (int num:
             nums) {
             //如果当前和大于0，那么将当前和加上当前数字
            if (sum > 0){
                sum += num;
            }else {
            //如果当前和小于0，那么舍弃当前和，当前和为当前数字
                sum = num;
            }
            //最大和为之前最大和和当前和最大的一个
            ans = Math.max(ans,sum);
        }
        return ans;
    }*/

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            if(max<dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}
