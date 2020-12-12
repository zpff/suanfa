package everyday;

import tree.TreeNode;

public class _222_countNodes {
    public int countNodes(TreeNode root) {
       return dfs(root);
    }

    private int dfs(TreeNode node) {
        if(node == null) return 0;
        return dfs(node.left) + dfs((node.right)) + 1;

    }
}
