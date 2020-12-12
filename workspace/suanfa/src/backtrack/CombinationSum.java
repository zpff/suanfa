package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//39.组合总和
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(combinations,candidates,target,new ArrayList<Integer>(),0,0);
        return combinations;
    }

    private void backTrack(List<List<Integer>> combinations, int[] candidates,
                           int target, ArrayList<Integer> integers,int sum,int begin) {
        /*if(sum > target){
            return;
        }*/
        if(sum == target){
            combinations.add(new ArrayList<>(integers));
            return;
        }
        //使用begin，当i=1的时候，下一次递归不会将数组的第0位加进去，能够去重
        for (int i = begin; i < candidates.length; i++) {
            sum += candidates[i];
            integers.add(candidates[i]);
            if(sum > target){
                sum -= candidates[i];
                integers.remove(integers.size()-1);
                break;
            }
            backTrack(combinations,candidates,target,integers,sum,i);
            sum -= candidates[i];
            integers.remove(integers.size()-1);
        }
    }

    public static void main(String[] args) {
        CombinationSum c = new CombinationSum();
        c.combinationSum(new int[]{2,3,6,7},7);

    }
}
