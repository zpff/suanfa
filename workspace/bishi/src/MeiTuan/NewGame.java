package MeiTuan;

import java.util.Scanner;
/*
第一行四个数字N，M，P，Q，表示这张地图是N行M列的，得分点的得分是P，陷阱点清除的代价是Q。
接下来N行，每行M个字符，表示这张地图。其中，字符S表示初始机器人位置。字符#表示墙壁，字符O代表得分点。字符X代表陷阱点。字符+代表普通的地块。
接下来一行一个连续的字符串表示机器人的移动路线，只由大写字母WASD构成，W向上，A向左，S向下，D向右。机器人可以上下左右移动。不能超出地图边界。也不能走到墙壁之上。试图走出边界和走到墙壁的行动会停留在原来的位置不动。

 6 6 20 10
S#++O#
OXX#X#
++++++
###XX#
++#O#+
OXO++X
SSDDDDDAWWSSSAWSSSADDD

40
*/
public class NewGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text = sc.nextLine().split(" ");
        int x = Integer.parseInt(text[0]);
        int y = Integer.parseInt(text[1]);
        int get = Integer.parseInt(text[2]);
        int lose = Integer.parseInt(text[3]);
        int a = 0;
        int b = 0;
        String[][] map = new String[x][y];
        for (int i = 0; i < x; i++) {
            String road = sc.nextLine();
            for (int j = 0; j < y; j++) {
                if (road.charAt(j) == 'S'){
                    a = i;
                    b = j;
                }
                map[i][j] = String.valueOf(road.charAt(j));
            }
        }
        String run = sc.nextLine();

        int point = 0;
        for (int i = 0; i < run.length(); i++) {
            if (run.charAt(i) == 'W'){
                a--;
            }
            if (run.charAt(i) == 'S'){
                a++;
            }
            if (run.charAt(i) == 'A'){
                b--;
            }
            if (run.charAt(i) == 'D'){
                b++;
            }
            if(map[a][b].equals("O")){
                point +=20;
                map[a][b]="+";
            }
            if(map[a][b].equals("X")){
                point -=10;
                map[a][b] = "+";
            }
        }
        System.out.println(point);
    }
}
