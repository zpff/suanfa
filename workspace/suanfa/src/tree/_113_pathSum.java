package tree;

import java.util.ArrayList;
import java.util.List;

public class _113_pathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> items = new ArrayList<>();
        if(root == null) return items;
        List<Integer> item = new ArrayList<>();
        helper(root, sum, items, item, 0);
        return items;
    }

    private void helper(TreeNode root, int sum, List<List<Integer>> items, List<Integer> item, int currentSum) {
        sum -= root.val;
        item.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum == 0) {
                items.add(new ArrayList<>(item));
            }
            return;
        }
        if (root.left != null) {
            helper(root.left, sum, items, item, currentSum);
            item.remove(item.size() - 1);
        }
        if (root.right != null) {
            helper(root.right, sum, items, item, currentSum);
            item.remove(item.size() - 1);
        }

    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(11);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(2);
        TreeNode t9 = new TreeNode(1);
        TreeNode t10 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        t3.right = t6;
        t4.left = t7;
        t4.right = t8;
        t6.left = t10;
        t6.right = t9;
        _113_pathSum pathSum = new _113_pathSum();
        pathSum.pathSum(t1, 22);

    }
}
