package Hot100;

import tree.TreeNode;

import java.util.HashMap;

public class _337_rob {
    HashMap<TreeNode,Integer> f = new HashMap<>();
    HashMap<TreeNode,Integer> g = new HashMap<>();
    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(f.getOrDefault(root,0), g.getOrDefault(root,0));
    }
    private void dfs(TreeNode node){
        if (node == null) return;
        dfs(node.left);
        dfs(node.right);
        f.put(node,node.val + g.getOrDefault(node.left,0)
                + g.getOrDefault(node.right,0));
        g.put(node, Math.max(f.getOrDefault(node.left,0),
                g.getOrDefault(node.left,0)) +
                        Math.max(f.getOrDefault(node.right,0),
                                g.getOrDefault(node.right,0)));
    }


    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(1);
        t1.left= t2;
        t1.right = t3;
        t2.right = t4;
        t3.right = t5;

        _337_rob rob = new _337_rob();
        System.out.println(rob.rob(t1));

    }
}
