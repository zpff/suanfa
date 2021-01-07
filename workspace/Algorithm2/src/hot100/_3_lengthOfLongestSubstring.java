package hot100;


import java.util.HashSet;

public class _3_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int rk = 0;
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) set.remove(s.charAt(i -1));
            while (rk < s.length() && !set.contains(s.charAt(rk))){
                set.add(s.charAt(rk));
                rk++;
            }
            ans = Math.max(ans,rk - i);
        }
        return ans;
    }
}
