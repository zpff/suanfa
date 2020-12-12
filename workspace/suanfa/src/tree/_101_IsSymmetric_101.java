package tree;

public class _101_IsSymmetric_101 {
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
        //使用两个指针向下寻找，p向左，q就向右，p向右，q就向左
    private boolean check(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p ==null || q == null || p.val != q.val) return false;

        return check(p.left,q.right) && check(p.right,q.left);
    }

}
