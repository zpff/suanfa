package DIDI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
D星群岛由n个小岛组成。为了加强小岛居民之间的交流，头目决定启动一个造桥工程，将全部n个岛连接到一起。

由于受到金融危机的影响，头目要求造桥的总成本要最少，并且还规定每一座桥的成本都不能超过k万D星币。

需要注意的是，由于受到地理环境和气候影响，有些小岛之间没有办法直接造桥。

现在给你m条小岛之间的造桥成本数据以及k的值，请问这个宏伟的造桥工程是否能够顺利完成？

注意：可能边不够，也可能费用超支。



多组输入，第1行输入一个正整数T表示输入数据的组数。

对于每一组输入数据：输入m+1行。

第1行包含三个正整数，分别表示n、m和k，n≤100，m≤1000，k≤10000，三个数字之间用空格隔开。

接下来m行表示m条小岛之间的造桥成本数据，每一行包含三个正整数，分别表示两个小岛的编号（从1开始）和这两个小岛之间的造桥成本（单位：万）。


2
3 3 400
1 2 200
1 3 300
2 3 500
3 3 400
1 2 500
1 3 600
2 3 700
 */
public class QunDao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QunDao qunDao = new QunDao();
        int qcase = scanner.nextInt();
        while(qcase-- >0){
            Set<Integer> set = new HashSet<>();
            int x =scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            while(y-->0){
                int start = scanner.nextInt();
                int end = scanner.nextInt();
                int path = scanner.nextInt();
                if (path <= z) {
                    set.add(start);
                    set.add(end);
                }
            }
            if(qunDao.isFull(set,x)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
    public boolean isFull(Set<Integer> set,int n){
        for (int i = 1; i <= n; i++) {
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
}
