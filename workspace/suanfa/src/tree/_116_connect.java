package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import tree.notRegluarTree.Node;

public class _116_connect {
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Node> nodes = new ArrayList<>();
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                Node node = queue.poll();
                nodes.add(node);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            for (int i = 0; i < nodes.size(); i++) {
                if (i == nodes.size() - 1) {
                    nodes.get(i).next = null;
                } else {
                    nodes.get(i).next = nodes.get(i + 1);
                }
            }
        }
        return root;
    }
}
