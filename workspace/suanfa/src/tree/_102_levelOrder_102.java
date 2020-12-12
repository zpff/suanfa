package tree;

import java.util.*;

public class _102_levelOrder_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> item = new ArrayList<>();
            //用当前队列的大小来控制list里面要添加几个值
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                TreeNode p = queue.poll();
                item.add(p.val);
                if(p.left!=null){
                    queue.offer(p.left);
                }
                if(p.right != null){
                    queue.offer(p.right);
                }
            }
            lists.add(item);
        }
        return lists;
    }

}