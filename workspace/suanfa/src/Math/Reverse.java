package Math;

public class Reverse {
    public int reverse(int x) {

        int ans = 0;
        while(x != 0){
            //取最后一位
            int pop = x%10;
            //得到除最后一位以外的数值
            x/=10;
            //如果当前结果值比最大值/10大或者当前值等于最大值/10并且将要加上的最后一位大于7，则溢出（因为7是最大值的最后一位2147483647）
            if(ans > Integer.MAX_VALUE/10 || ans == Integer.MAX_VALUE/10 && pop > 7) return 0;
            //同理-2147483648
            if(ans < Integer.MIN_VALUE/10 || ans == Integer.MIN_VALUE/10 && pop < -8) return 0;
            ans += ans * 10 +pop;
        }
        return ans;
    }
}
