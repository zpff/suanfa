package tree;

public class _226_invertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode treeNode = new TreeNode(root.val);
        treeNode.left = invertTree(root.right);
        treeNode.right = invertTree(root.left);
        return treeNode;
    }
}
