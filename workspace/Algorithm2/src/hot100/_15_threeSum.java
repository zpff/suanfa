package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n -2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < n -1; j++) {
                if (j > i + 1 && nums[j] == nums[j -1]) continue;
                int k = n - 1;
                int target = - nums[i];
                while (k > j){
                    if (nums[j] + nums[k] < target){
                        break;
                    }else if (nums[j] + nums[k] > target){
                        k--;
                    }else if (nums[j] + nums[k] == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        System.out.print(nums[i] + " " + nums[j]+ " "+nums[k]);
                        System.out.println();
                        res.add(list);
                        break;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        _15_threeSum threeSum = new _15_threeSum();
        threeSum.threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}
