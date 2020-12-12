package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteUnique_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        if(nums.length == 0) return lists;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];

        backTrack(lists,list,nums,used,0);
        return lists;
    }

    private void backTrack(List<List<Integer>> lists, List<Integer> list,
                           int[] nums, boolean[] used, int index) {
        if(index == nums.length){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //!used[i - 1]的原因是当进行对第二个1判断时，前面的1的状态因为回溯设为了false，
            // 如果不是false说明不是回溯过来的，那么就可以在这一层循环进行添加，不然只能跳出当前循环。
            if(used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]){
                continue;
            }
            list.add(nums[i]);
            used[i] = true;
            backTrack(lists,list,nums,used,index + 1);
            list.remove(list.size() -1);
            used[i] = false;
        }
    }


    public static void main(String[] args) {
        PermuteUnique_47 permute_47 = new PermuteUnique_47();
        List<List<Integer>> lists = permute_47.permuteUnique(new int[]{1, 1, 2});
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