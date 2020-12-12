package tree;

public class IsValidBST_98 {
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    //考虑每个子树的值域
    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if(node == null) return true;
        if(lower != null && node.val <= lower){
            return false;
        }
        if(upper != null && node.val >= upper){
            return false;
        }

        if(!(helper(node.left,lower,node.val))){
            return false;
        }
        if(!(helper(node.right,node.val,upper))){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(6);
        TreeNode t5 = new TreeNode(20);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
        IsValidBST_98 i = new IsValidBST_98();
        System.out.println(i.isValidBST(t1));
        TreeNode t6 = new TreeNode(2);
        TreeNode t7 = new TreeNode(1);
        TreeNode t8 = new TreeNode(3);
        t6.left = t7;
        t6.right =t8;
        System.out.println(i.isValidBST(t6));
    }
}
