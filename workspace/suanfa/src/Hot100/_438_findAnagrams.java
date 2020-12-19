package Hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _438_findAnagrams {
    //超时
    /*public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagrams = new ArrayList<>();
        char[] cp = p.toCharArray();
        Arrays.sort(cp);
        String newp = String.valueOf(cp);
        int n = s.length();
        for (int i = 0; i <= n - p.length(); i++) {
            String str = s.substring(i,i+p.length());
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            if (String.valueOf(cs).equals(newp)){
                anagrams.add(i);
            }
        }
        return anagrams;
    }*/
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagrams = new ArrayList<>();
        if (s.length() ==0 || p.length() == 0) return anagrams;
        int[] dict = new int[26];

        for (char c:
             p.toCharArray()) {
            dict[c-'a'] += 1;
        }

        int[] window = new int[26];
        int left = 0;
        int right = 0;
        while (right < s.length()){
            int curR = s.charAt(right) - 'a';
            right++;
            window[curR] += 1;
            while (window[curR] > dict[curR]){
                int curL = s.charAt(left) - 'a';
                window[curL]--;
                left++;
            }
            if (right - left == p.length()) anagrams.add(left);
        }
        return anagrams;
    }
}
