package hot100;

import java.util.ArrayList;
import java.util.List;

public class _46_permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutes = new ArrayList<>();
        backTrack(permutes,nums,new ArrayList<>(),0);
        return permutes;
    }

    private void backTrack(List<List<Integer>> permutes, int[] nums,
                           ArrayList<Integer> permute,int n) {
        if (n == nums.length){
            permutes.add(new ArrayList<>(permute));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (permute.contains(nums[i])){
                continue;
            }
            permute.add(nums[i]);
            backTrack(permutes,nums,permute,n+1);
            permute.remove(permute.size() -1);
        }

    }
}
