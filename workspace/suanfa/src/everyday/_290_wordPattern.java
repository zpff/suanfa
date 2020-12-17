package everyday;

public class _290_wordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] S = s.split(" ");
        if (pattern.length()!=S.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            for (int j = i+1; j < S.length; j++) {
                if (pattern.charAt(i) == pattern.charAt(j) && !S[i].equals(S[j])
            || pattern.charAt(i) != pattern.charAt(j) && S[i].equals(S[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
