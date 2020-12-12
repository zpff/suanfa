package tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class InorderTraversal {
    List<Integer> res;
    public List<Integer> inorderTraversal(TreeNode root){
        res = new ArrayList<>();
        inorder(root);
        return res;

    }
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }

}
