package tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _144_preorderTraversal {
    /*public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        dfs(root,preorder);
        return preorder;
    }

    private void dfs(TreeNode root, List<Integer> preorder) {
        if(root == null) return;
        preorder.add(root.val);
        dfs(root.left,preorder);
        dfs(root.right,preorder);
    }*/
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.right = t2;
        t2.left = t3;
        _144_preorderTraversal preorderTraversal = new _144_preorderTraversal();
        preorderTraversal.preorderTraversal(t1);
    }
}

