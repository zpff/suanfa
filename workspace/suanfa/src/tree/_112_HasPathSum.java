package tree;

import java.util.HashSet;

public class _112_HasPathSum {
    /*public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        int currentSum = 0;
        HashSet<Integer> currentSums = new HashSet<>();
        backTrack(root, currentSum, currentSums);
        return currentSums.contains(sum);
    }

    private void backTrack(TreeNode root, int currentSum, HashSet<Integer> currentSums) {
        currentSum += root.val;
        if (root.left == null && root.right == null) {
            currentSums.add(currentSum);
            return;
        }
        if (root.left != null) {
            backTrack(root.left, currentSum, currentSums);
        }
        if (root.right != null) {
            backTrack(root.right, currentSum, currentSums);
        }

    }*/
    public boolean hasPathSum(TreeNode root, int sum) {
        //如果是空节点直接返回false
        if (root == null) {
            return false;
        }
        //如果是叶子节点那么比较当前的sum和root.val是否相等
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        //如果非叶子节点，分别递归树的左子树和右子树
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
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
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        t3.right = t6;
        t4.left = t7;
        t4.right = t8;
        t6.right = t9;
        _112_HasPathSum hasPathSum = new _112_HasPathSum();
        hasPathSum.hasPathSum(t1, 22);

    }
}
