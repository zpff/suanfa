package tree;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    List<Integer> res;
    public List<Integer> preorder(Node root){
        res = new ArrayList<>();
        if (root == null) return res;
        dfs(root);
        return res;
    }
    public void dfs(Node root){
        if (root ==null) return;
        res.add(root.val);
        for (Node node:
             root.children) {
            dfs(node);
        }
    }
    
}
