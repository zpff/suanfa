package everyday;

import java.io.CharConversionException;
import java.util.HashMap;

public class _205_isIsomorphic {
    //超时
    /*public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if ((s.charAt(i) == s.charAt(j) && t.charAt(i) != t.charAt(j)) ||
                s.charAt(i) != s.charAt(j) && t.charAt(i) == t.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }*/
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s2t = new HashMap<>();
        HashMap<Character, Character> t2s = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);
            if (s2t.containsKey(x) && s2t.get(x) != y ||t2s.containsKey(y) && t2s.get(y) != x){
                return false;
            }
            s2t.put(x,y);
            t2s.put(y,x);
        }
        return true;
    }

}
