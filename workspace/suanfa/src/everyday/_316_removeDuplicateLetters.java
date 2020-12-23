package everyday;

public class _316_removeDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        boolean[] vis = new boolean[26];
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!vis[ch - 'a']) {
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
                    if (num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                        vis[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        break;
                    }
                }
                sb.append(ch);
                vis[ch - 'a'] = true;
            }
            num[ch - 'a']--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        _316_removeDuplicateLetters removeDuplicateLetters = new _316_removeDuplicateLetters();
        System.out.println(removeDuplicateLetters.removeDuplicateLetters("cbacdcbc"));
    }
}
