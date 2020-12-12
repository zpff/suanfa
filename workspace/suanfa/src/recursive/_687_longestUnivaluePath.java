package recursive;

import tree.TreeNode;

public class _687_longestUnivaluePath {
    int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        longestPath(root);
        return ans;
    }
    public int longestPath(TreeNode node){
        if (node == null) return 0;
        int maxLorRres = 0;
        int left = longestPath(node.left);
        int right = longestPath(node.right);

        if(node.left != null&&node.right!=null&&
                node.left.val == node.val &&node.right.val == node.val){
            ans = Math.max(ans,left+right+2);
        }
        if(node.left!=null&&node.left.val==node.val){
            maxLorRres = left+1;
        }
        if(node.right!=null&&node.right.val==node.val){
            maxLorRres = Math.max(maxLorRres,right+1);
        }
        ans = Math.max(ans,maxLorRres);
        return maxLorRres;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(1);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.right = t6;
        _687_longestUnivaluePath longestUnivaluePath = new _687_longestUnivaluePath();
        longestUnivaluePath.longestUnivaluePath(t1);
    }
}
