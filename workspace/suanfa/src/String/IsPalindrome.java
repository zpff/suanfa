package String;
//9.回文数（转换为字符串的做法）

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String s = x+"";
        if(s.length() == 1) return true;

        int head = 0;
        int tail = s.length() - 1;

        while(head < tail){
            if(s.charAt(head) != s.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}
