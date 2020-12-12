package tree;

import java.util.ArrayList;
import java.util.List;

public class _145_postorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        dfs(root,postorder);
        return postorder;
    }

    private void dfs(TreeNode root, List<Integer> postorder) {
        if (root == null) return;
        dfs(root.left,postorder);
        dfs(root.right,postorder);
        postorder.add(root.val);
    }
}
