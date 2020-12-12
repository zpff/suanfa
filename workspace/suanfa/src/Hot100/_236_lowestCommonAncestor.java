package Hot100;

import tree.TreeNode;

import java.util.HashMap;
import java.util.HashSet;

public class _236_lowestCommonAncestor {
    HashMap<Integer,TreeNode> parent = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        while (p != null){
            visited.add(p.val);
            p = parent.get(p.val);
        }
        while (q != null){
            if (visited.contains(q.val)){
                return q;
            }else {
                q = parent.get(q.val);
            }
        }
        return  null;
    }
    private void dfs(TreeNode root){
        if (root.left != null){
            parent.put(root.left.val,root);
            dfs(root.left);
        }
        if (root.right != null){
            parent.put(root.right.val,root);
            dfs(root.right);
        }
    }
}
