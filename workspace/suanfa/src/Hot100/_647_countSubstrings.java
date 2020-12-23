package Hot100;

import sun.font.FontRunIterator;

public class _647_countSubstrings {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && i - j < 2 || dp[i-1][j+1]){
                    dp[i][j] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
