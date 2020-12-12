package BanYu;

import java.util.HashMap;
import java.util.Map;

public class MinInsertions {
    public int minInsertions (String s) {
        // write code here
        int n =s.length();
        int index = 0;
        int left = 0;
        int res = 0;
        while (index<n){
            if (s.charAt(index) == '('){
                left++;
                index++;
            }else{
                if(left>0){
                    left--;
                }else {
                    res++;
                }
                if (index == n-1 || s.charAt(index+1)!=')'){
                    res++;
                    index++;
                }else{
                    index +=2;
                }
            }
        }
        return res+left*2;
    }
}
