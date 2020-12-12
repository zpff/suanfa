package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//40. 组合总和 II
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(combinations,combination,candidates,target,target,0);
        return combinations;
    }

    private void backTrack(List<List<Integer>> combinations,
                           List<Integer> combination, int[] candidates, int target, int result,int begin) {
        if(result == 0){
            combinations.add(new ArrayList<>(combination));
            return;
        }
        //用begin来控制下一层递归从第几个数开始
        for (int i = begin; i < candidates.length; i++) {
            //去重，因为排序好了，同一层循环如果后一个数等于前一个数，那么就跳过
            if(i > begin && candidates[i] == candidates[i-1] ){
                continue;
            }
            //剪枝，当前循环内，如果result小于当前数字，那么跳出循环
            if(result - candidates[i] < 0){
                break;
            }
            combination.add(candidates[i]);
            //因为不能重复使用，所以下一层递归从当前数字后面一个开始取
            backTrack(combinations,combination,candidates,target,result - candidates[i],i + 1);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum2 c = new CombinationSum2();
        c.combinationSum2(new int[]{10,1,2,7,6,1,5},8);

    }
}
