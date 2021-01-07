package hot100;

public class _5_longestPalindrome {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;
        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        int begin = 0;
        int maxLen = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j < 3 || dp[i - 1][j + 1])){
                    dp[i][j] = true;
                    if (i - j > maxLen){
                        maxLen = i - j;
                        begin = j;
                    }
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
}
