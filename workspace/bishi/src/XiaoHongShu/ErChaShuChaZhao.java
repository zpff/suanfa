package XiaoHongShu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ErChaShuChaZhao {

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int findMin(int[] tree) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < tree.length; i++) {
            list.add(tree[i]);
        }
        int num =1;
        while(list.contains(num)){
            num++;
        }
        return  num;
    }


    /*一个二叉树深度为k，节点取值为自然数,k<=5，找出不在树中的最小自然数，需要给出O(N)的算法。 bool exist(Tree tree, int n)
        [4,32,34,11,22,33,5,15,16,17,18]
        1
     */


    public static void main(String[] args) {
        int[] tree = {7, 6, 4};
        System.out.println(findMin(tree));
    }
}
/*int num = 1;
        for (int i = 0; i < tree.length; i++) {
            if (tree[i] == num) {
                num++;
                i = 0;
            }
        }
        return num;

 */