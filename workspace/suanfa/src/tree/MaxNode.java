package tree;

public class MaxNode {
    TreeNode node = null;
    public TreeNode maxNode(TreeNode root) {
        node = root;
        int res = root.val;
        // write your code here
       preorder(root,res);
       return node;
    }
    public void preorder(TreeNode node, int res){
        if(node == null) return;
        if(res < node.val){
            node = node;
            res = node.val;
        }
        preorder(node.left,res);
        preorder(node.right,res);
    }


}
