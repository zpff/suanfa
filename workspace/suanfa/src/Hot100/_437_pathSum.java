package Hot100;

import tree.TreeNode;

public class _437_pathSum {
    int res = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        dfs(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return res;
    }

    private void dfs(TreeNode node, int sum) {
        if (node == null) return;
        sum -= node.val;
        if (sum == 0) res++;
        dfs(node.left,sum);
        dfs(node.right,sum);
    }

    public static void main(String[] args) {
        _437_pathSum p = new _437_pathSum();
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(-3);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(11);
        TreeNode t7 = new TreeNode(3);
        TreeNode t8 = new TreeNode(-2);
        TreeNode t9 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.right = t6;
        t4.left = t7;
        t4.right = t8;
        t5.right = t9;
        p.pathSum(t1,8);

    }
}
