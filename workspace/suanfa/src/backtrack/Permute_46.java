package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Permute_46 {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        if (nums.length == 0) return lists;
        List<Integer> list = new ArrayList<>();
        backTrack(lists, list, nums, 0);
        return lists;
    }

    private void backTrack(List<List<Integer>> lists, List<Integer> list, int[] nums, int index) {
        if (index == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            backTrack(lists, list, nums, index + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Permute_46 permute_46 = new Permute_46();
        List<List<Integer>> lists = permute_46.permute(new int[]{1, 2, 3});
        for (List<Integer> list:
             lists) {
            for (Integer i:
                 list) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
