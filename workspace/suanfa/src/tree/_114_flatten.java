package tree;

import sun.reflect.generics.tree.Tree;

import java.util.Map;

public class _114_flatten {
    public void flatten(TreeNode root) {
        TreeNode cur = root;
        //当当前节点不为空时
        while (cur != null){
            //判断左节点是否为空，如果不为空
            if(cur.left != null){
                //左节点将成为当前节点的下一个节点
                TreeNode next = cur.left;
                TreeNode pre = next;
                //找到当前节点子树最右节点作为右子树的前驱结点
                while (pre.right != null){
                    pre = pre.right;
                }
                //将当前节点的右子树赋给前驱节点
                pre.right = cur.right;
                //当前节点左子树置为空
                cur.left = null;
                //将下个节点作为当前节点右节点
                cur.right = next;
            }
            //当前节点右节点作为下个当前节点
            cur = cur.right;
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t2.left = t3;
        t2.right= t4;
        t1.right=t5;
        t5.right=t6;
        _114_flatten flatten = new _114_flatten();
        flatten.flatten(t1);
    }
}
