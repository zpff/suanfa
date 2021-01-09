package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _39_combinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(combinations,candidates,target,0,new ArrayList<Integer>());
        return combinations;
    }

    private void backTrack(List<List<Integer>> combinations, int[] candidates,
                           int target, int begin,List<Integer> combination){
        if (target == 0){
            combinations.add(new ArrayList<>(combination));
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            target -= candidates[i];
            combination.add(candidates[i]);
            if (target < 0){
                target += candidates[i];
                combination.remove(combination.size() - 1);
                break;
            }
            backTrack(combinations,candidates,target,i,combination);
            target += candidates[i];
            combination.remove(combination.size() - 1);
        }

    }
}
