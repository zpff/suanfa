package AiQiYi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//无重复最长子字符串
public class LengthOFLongestSubstring {
    public static int lengthOfLongestSubstring(String s){

        int n = s.length(),ans = 0;
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0,j = 0; i < n; i++) {
            char a  = s.charAt(i);
            if(map.containsKey(a)){
                j = Math.max(map.get(a),j);

            }
            ans = Math.max(ans,i-j+1);
            map.put(s.charAt(i),i+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(lengthOfLongestSubstring(s));

    }
}
