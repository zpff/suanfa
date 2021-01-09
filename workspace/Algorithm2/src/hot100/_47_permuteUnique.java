package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _47_permuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permuteUniques = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backTrack(permuteUniques,nums,new ArrayList<>(),0,used);
        return permuteUniques;
    }

    private void backTrack(List<List<Integer>> permuteUniques,
                           int[] nums, ArrayList<Integer> permute, int n,boolean[] used) {
        if (n == nums.length){
            permuteUniques.add(new ArrayList<>(permute));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]){
                continue;
            }
            if (i > 0&& nums[i] == nums[i-1]&&!used[i-1]){
                continue;
            }
            permute.add(nums[i]);
            used[i] = true;
            backTrack(permuteUniques,nums,permute,n+1,used);
            permute.remove(permute.size() -1);
            used[i] = false;
        }

    }
}
