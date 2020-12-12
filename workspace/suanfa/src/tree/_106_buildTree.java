package tree;

import java.util.HashMap;

public class _106_buildTree {
    HashMap<Integer,Integer> indexMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i],i);
        }
        return build(inorder,postorder,0,n-1,0,n-1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int postorderLeft, int postorderRight,
                           int inorderLeft, int inorderRight) {
        if(postorderLeft > postorderRight){
            return null;
        }

        int postRootIndex = postorderRight;

        int inRootIndex = indexMap.get(postorder[postorderRight]);

        int rightTreeSzie = inorderRight - inRootIndex;

        TreeNode root = new TreeNode(postorder[postorderRight]);

        root.left  = build(inorder,postorder,postorderLeft,
                postorderRight-rightTreeSzie -1,inorderLeft,inRootIndex-1);
        root.right = build(inorder,postorder,postorderRight-rightTreeSzie,
                postorderRight-1,inRootIndex+1,inorderRight);
        return root;
    }
}
