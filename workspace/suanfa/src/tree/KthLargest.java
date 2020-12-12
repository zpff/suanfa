package tree;

public class KthLargest {
    int res ;
    int k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        inorder(root);
        return res;
    }
    public void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.right);
        if(k==0) return;
        if(--k == 0) {
            res = node.val;
            return;
        }
        inorder(node.left);
    }
}
