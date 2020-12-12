package recursive;

import tree.TreeNode;

public class _563_findTilt {
    int tilt = 0;
    public int findTilt(TreeNode root) {
        nodeSlope(root);
        return tilt;
    }
    public int nodeSlope(TreeNode node){
        if(node == null) return 0;
        int leftVal = nodeSlope(node.left);
        int rightVal = nodeSlope(node.right);
        tilt += Math.abs(leftVal-rightVal);
        return leftVal+rightVal+node.val;
    }
}
