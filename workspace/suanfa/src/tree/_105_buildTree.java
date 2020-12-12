package tree;

import java.util.HashMap;

public class _105_buildTree {
    HashMap<Integer,Integer> indexMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i],i);
        }

        return build(preorder,inorder,0,n-1,0,n-1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int preorderLeft, int preorderRight,
                           int inorderLeft, int inorderRight) {
        if(preorderLeft > preorderRight){
            return null;
        }

        int inRootIndex = indexMap.get(preorder[preorderLeft]);

        int leftTreeSize = inRootIndex - inorderLeft;

        TreeNode root = new TreeNode(preorder[preorderLeft]);

        root.left = build(preorder,inorder,preorderLeft + 1,
                preorderLeft + leftTreeSize,inorderLeft,inRootIndex -1);

        root.right = build(preorder,inorder, preorderLeft + leftTreeSize + 1,
                preorderRight,inRootIndex + 1,inorderRight);

        return root;
    }

}
