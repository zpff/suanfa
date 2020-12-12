package DIDI;

import java.util.ArrayList;
import java.util.Scanner;

public class PoJie {
    public static String poJie(int n, String s) {
        String[] S = s.split("");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < S.length) {
            int j = i + n - 1;
            if (j >= S.length) {
                j = S.length - 1;
            }
            while (j < S.length && j >= i) {
                sb.append(S[j]);
                j--;
            }
            i += n;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        for (int i = 0; i < 2; i++) {
            list.add(sc.nextLine());
        }

        int n = Integer.parseInt(list.get(0).toString());
        String s = list.get(1).toString();
        System.out.println(poJie(n, s));
    }
}

