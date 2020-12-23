package Hot100;

import tree.TreeNode;

import java.text.DateFormatSymbols;

public class _543_diameterOfBinaryTree {
    int path = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        path =Math.max(depth(root.right) + depth(root.left),path);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return path;
    }
    public int depth(TreeNode node){
        if (node == null) return 0;
        return Math.max(depth(node.left),depth(node.right)) + 1;
    }
}
