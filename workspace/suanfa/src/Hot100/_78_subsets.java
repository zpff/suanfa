package Hot100;

import java.util.ArrayList;
import java.util.List;

public class _78_subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        backTrack(results, nums, new ArrayList<Integer>(), 0);
        return results;
    }

    private void backTrack(List<List<Integer>> results,
                           int[] nums, ArrayList<Integer> subset, int index) {
        results.add(new ArrayList<>(subset));
        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            backTrack(results, nums, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        _78_subsets subsets = new _78_subsets();
        subsets.subsets(new int[]{1, 2, 3});
    }
}
