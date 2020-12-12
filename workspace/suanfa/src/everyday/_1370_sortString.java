package everyday;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _1370_sortString {
    public String sortString(String s) {
        char[] cs = s.toCharArray();
        int[] bucket = new int[26];

        for (int i = 0; i < cs.length; i++) {
            bucket[cs[i] -'a']++;
        }
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index < cs.length){
            for (int i = 0; i < 26; i++) {
                if(bucket[i]!=0){
                    sb.append((char) (i + 'a'));
                    bucket[i]--;
                    index++;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (bucket[i]!= 0){
                    sb.append((char)(i+'a'));
                    bucket[i]--;
                    index++;
                }
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        _1370_sortString sortString = new _1370_sortString();
        System.out.println(sortString.sortString("aaaabbbbcccc"));
    }
}
