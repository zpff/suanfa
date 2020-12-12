package WanMeiShiJie;

import java.util.ArrayList;
import java.util.Scanner;

public class GaoAiShu {
    public static void main(String[] args){
        // code here
        Scanner sc = new Scanner(System.in);
        String[] LineCount = sc.nextLine().split(" ");
        int a = Integer.parseInt(LineCount[0]);
        int b = Integer.parseInt(LineCount[1]);
        String[] CountA = new String[a];
        for (int i = 0; i < a; i++) {
            CountA[i] = sc.nextLine();
        }
        String[] CountB= new String[b];
        for (int i = 0; i < b; i++) {
            CountB[i] = sc.nextLine();
        }
        ArrayList<Integer> arrA =getList(CountA);
        ArrayList<Integer> arrB =getList(CountB);

        int count = 0;
        for (int i = 0; i < arrA.size(); i++) {
            for (int j = 0; j < arrB.size(); j++) {
                if (arrA.get(i)>arrB.get(j)){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
    public static ArrayList<Integer> getList(String[] Count){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < Count.length; i++) {
            String[] tmp = Count[i].split(" ");
            int m = Integer.parseInt(tmp[1]);
            int n = Integer.parseInt(tmp[0]);
            for (int j = 0; j < m; j++) {
                arr.add(n);
            }
        }
        return arr;
    }
}
