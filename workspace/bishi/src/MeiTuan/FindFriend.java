package MeiTuan;

import java.util.Scanner;

public class FindFriend {
    public static String findFriend(String s, String t) {
        String[] S = s.split("");
        String[] T = t.split("");
        int i = 0;
        int j = 0;
        int[] plus = new int[T.length];
        while (j < T.length && i < S.length) {
            if (S[i].equals(T[j])) {
                plus[j] = i;
                i++;
                j++;
            }else{
                i++;
            }
        }
        int num = 0;
        for (int k = 0; k < plus.length; k++) {
            num += plus[k]+1;
        }
        if (j == T.length) return ""+num;
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String s = sc.nextLine();
        String t = sc.nextLine();
        String res = findFriend(s,t);
        if(!res.equals("No")){
            System.out.println("Yes");
            System.out.println(res);
        }else{
            System.out.println(res);
        }

    }
}
