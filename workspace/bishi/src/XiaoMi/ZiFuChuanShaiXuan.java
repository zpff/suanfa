package XiaoMi;

import java.util.HashSet;
import java.util.Scanner;

/*
给定一个字符串, 需要去除所有之前曾经出现过的字符，只保留第一次出现的字符

hello, welcome to xiaomi

helo, wcmtxia
 */
public class ZiFuChuanShaiXuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
