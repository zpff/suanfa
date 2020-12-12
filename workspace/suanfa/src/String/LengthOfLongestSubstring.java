package String;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s == null) return 0;
        Set<Character> occ = new HashSet<>();
        int rk = -1;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i != 0){
                occ.remove(s.charAt(i));
            }
            while(rk+1<s.length()&&!occ.contains(s.charAt(rk+1))){
                occ.add(s.charAt(rk+1));
                rk++;
            }
            ans = Math.max(ans,rk+1-i);
        }
        return ans;
    }

}
