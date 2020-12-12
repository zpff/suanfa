package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18_fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> Sums = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n-3; i++) {
            List<Integer> fourSum = new ArrayList<>();
            if(i>0&&nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1; j <n-2 ; j++) {
                if(j>i+1&&nums[j] == nums[j-1]){
                    continue;
                }
                for (int k = j+1; k < n-1; k++) {
                    if(k>j+1&&nums[k] == nums[k-1]){
                        continue;
                    }
                    for (int l = k+1; l < n; l++) {
                        if(l>k+1&&nums[l] == nums[l-1]){
                            continue;
                        }
                        if(target == nums[i]+nums[j]+nums[k]+nums[l]){
                            fourSum.add(nums[i]);
                            fourSum.add(nums[j]);
                            fourSum.add(nums[k]);
                            fourSum.add(nums[l]);
                            Sums.add(fourSum);
                            fourSum = new ArrayList<>();
                        }
                    }
                }
            }
        }
        return Sums;
    }
}
