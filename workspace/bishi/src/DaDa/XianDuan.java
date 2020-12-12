package DaDa;

import java.util.Scanner;
/*
2
5
15,20
4,12
17,24
14,29
23,45
13,22

1
5
1,30
2,22
17,24
14,29
13,45
13,32
 */
public class XianDuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String func = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        int[][] line = new int[num+1][2];
        for (int i = 0; i < num+1; i++) {
            String text = sc.nextLine();
            String[] twoNum = text.split(",");
            line[i][0] = Integer.parseInt(twoNum[0]);
            line[i][1] = Integer.parseInt(twoNum[1]);
        }

        if(func.equals("1")){
            for (int i = 0; i < num; i++) {
                int x = line[i][0];
                int y = line[i][1];
                int m = line[num][0];
                int n = line[num][1];
                if (isBaoHan(x,y,m,n)){
                    System.out.println(x+","+y);
                }
            }
        }else{
            for (int i = 0; i < num; i++) {
                int x = line[i][0];
                int y = line[i][1];
                int m = line[num][0];
                int n = line[num][1];
                if (isChongDie(x,y,m,n)){
                    System.out.println(x+","+y);
                }
            }
        }
    }
    public static boolean isBaoHan(int x,int y,int m,int n){
        if(x>m&&y<n) return true;
        return false;
    }
    public static boolean isChongDie(int x,int y,int m,int n){
        if((x>m&&x<n)||(y>m&&y<n)) return true;
        return false;
    }
}
