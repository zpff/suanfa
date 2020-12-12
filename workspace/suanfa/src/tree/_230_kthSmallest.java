package tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class _230_kthSmallest {
    ArrayList<Integer> vals = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        return vals.get(k-1);
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        vals.add(root.val);
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(2);
        t1.left = t2;
        t1.right =t3;
        t2.right = t4;
        _230_kthSmallest kthSmallest = new _230_kthSmallest();
        kthSmallest.kthSmallest(t1,1);
    }
}
