package tree;

public class NumTrees_96 {
    public static int numTrees(int n) {
        if(n == 0) return 1;
        int[] G = new int[n+1];
        G[0] = 1;
        G[1] = 1;
        //根为 iii 的所有二叉搜索树的集合是左子树集合和右子树集合的笛卡尔积
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                G[i] += G[j -1]*G[i-j];
            }
        }
        return G[n];
    }

    public static void main(String[] args) {
        numTrees(4);
    }
}
