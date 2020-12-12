package String;

//5.最长回文子串
public class longestPalindrome_5 {
    //暴力解法
    /*public String longestPalindrome(String s) {
        //先获得字符串的总长度
        int n = s.length();
        //当长度等于1时直接返回
        if(n < 2 ){
            return s;
        }
        //设置默认最长子串长度和起始下标
        int maxLen = 1;
        int begin = 0;
        //左下标从0开始，倒数第二位结束
        for (int i = 0; i < n - 1; i++) {
        //右下标从左下标加1开始，到最后一个位结束
            for (int j = i + 1; j < n; j++) {
            //当子串长度大于之前最长长度，并且是一个回文串的时候，更新最长长度和起始下标
                if (j - i + 1 > maxLen && isPalindrome(s,i,j)){
                    maxLen = j -i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
    public boolean isPalindrome(String s,int left,int right){
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }*/
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n < 2) return s;

        int maxLen = 1;
        int begin = 0;

        //创建dp表，行和列都为字符长度，对角线全为true
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        //按列开始填写
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                //如果首尾字符不同，i到j位置的字符非回文
                if (s.charAt(i)!=s.charAt(j)){
                    dp[i][j] = false;
                    //如果相同并且这个子字符串的长度小于等于3，那么是回文
                }else if(j - i < 3){
                    dp[i][j] = true;
                    //如果大于3，那么看i+1到j-1位置是否为回文
                }else{
                    dp[i][j] = dp[i+1][j-1];
                }
                if(dp[i][j]&&j-i+1>maxLen){
                    maxLen = j-i+1;
                    begin = i;
                }
            }

        }
        return s.substring(begin,begin+maxLen);
    }

}
