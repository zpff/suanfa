package everyday;

import java.util.Arrays;

public class _242_isAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() == 0 && t.length() ==0) return true;
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        String news = String.valueOf(cs);
        String newt = String.valueOf(ct);

        if(news.equals(newt)) return true;

        return false;
    }
}
