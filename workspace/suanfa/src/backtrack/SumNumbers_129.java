package backtrack;

import tree.TreeNode;

import javax.swing.text.StyledEditorKit;
import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.List;

public class SumNumbers_129 {
    //dfs
    /*public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    private int dfs(TreeNode root,int sum){
        if(root == null) return 0;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }else{
            return dfs(root.left,sum) + dfs(root.right,sum);
        }
    }*/
    //回溯
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> nums = new ArrayList<>();
        backTrack(root, nums ,new StringBuilder());
        int sum = 0;
        for (Integer num:
             nums ) {
            sum += num;
        }
        return sum;
    }
    private void backTrack(TreeNode root, ArrayList nums, StringBuilder num) {
        num = num.append(root.val);
        if(root.left == null && root.right == null){
            nums.add(Integer.parseInt(num.toString()));
            num.deleteCharAt(num.length()-1);
            return;
        }
        if(root.left != null){
            backTrack(root.left,nums,num);
        }if (root.right != null){
            backTrack(root.right,nums,num);
        }
        num.deleteCharAt(num.length()-1);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(0);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(1);
        t1.left = t2;
        t1.right =t3;
        t2.left = t4;
        t2.right =t5;
        SumNumbers_129 sumNumbers_129 = new SumNumbers_129();
        System.out.println(sumNumbers_129.sumNumbers(t1));
    }
}