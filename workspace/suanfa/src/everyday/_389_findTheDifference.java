package everyday;

import java.util.Arrays;

public class _389_findTheDifference {
    public char findTheDifference(String s, String t) {
        if (s.length() == 0) return t.toCharArray()[0];
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] != ct[i]) return ct[i];
        }
        return ct[ct.length - 1];
    }

    public static void main(String[] args) {
        _389_findTheDifference findTheDifference = new _389_findTheDifference();
        findTheDifference.findTheDifference("ana","anca");
    }
}
