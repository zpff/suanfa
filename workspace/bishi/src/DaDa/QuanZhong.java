package DaDa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanZhong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[][] line = new int[num+1][2];
        for (int i = 0; i < num+1; i++) {
            String text = sc.nextLine();
            String[] twoNum = text.split(",");
            line[i][0] = Integer.parseInt(twoNum[0]);
            line[i][1] = Integer.parseInt(twoNum[1]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            
        }
    }
}
