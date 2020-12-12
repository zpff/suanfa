package tree;

import java.util.ArrayList;
import java.util.List;

public class IncreasingBST {
    static TreeNode cur;
    static TreeNode node = new TreeNode(1);
    public TreeNode increasingBST(TreeNode root) {
        TreeNode cur = node;
        inorder(root);
        return node.right;
    }
   public static void inorder(TreeNode root){
        if (root == null) return;
        inorder(root.left);
        cur.right = root;
        cur = cur.right;
        inorder(root.right);
   }
}
