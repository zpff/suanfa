package XiaoHongShu;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class FeiKongZiChuan {
    static int solution(String s) {
        int count =0;
        String[] sc = s.split("");
        int i =0;
        if(sc[i].equals(sc[sc.length-1])){
            return 1;
        }
        while(i < sc.length) {
            for (int j = sc.length-1; j >= i ; j--) {
                if (sc[i].equals(sc[j])||j==i) {
                    i = j+1;
                    j = sc.length -1 ;
                    count++;
                }
            }

            i++;
        }
    return count+1;
    }
    /*
给定一个非空的字符串s ，将s切割成若干个非空子串，要求每个子串头尾是相同字符 ，给出切割的子串的数量最少的方法。
abaccd
3

*/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }

        res = solution(_s);
        System.out.println(String.valueOf(res));

    }
}

