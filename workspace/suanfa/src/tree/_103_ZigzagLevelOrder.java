package tree;

import java.util.*;

public class _103_ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null) return lists;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            LinkedList<Integer> item = new LinkedList<>();
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                TreeNode p = queue.poll();
                //使用linkedList来控制插入值的顺序，queue还是一样的正向入队出队
                if(flag == true){
                    item.add(p.val);
                }else {
                    item.push(p.val);
                }
                if(p.left!=null){
                    queue.offer(p.left);
                }
                if (p.right != null){
                    queue.offer(p.right);
                }
            }
            flag = !flag;
            lists.add(item);
        }

        return lists;
    }
}
