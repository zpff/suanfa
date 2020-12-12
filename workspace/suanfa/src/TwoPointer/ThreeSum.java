package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//15. 三数之和
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        //首先对数组排序
        Arrays.sort(nums);
        int n = nums.length;

        //第一层循环
        for (int i = 0; i < n; i++) {
            //去除重复的
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            //第二层循环从i+1位置开始
            for (int j = i + 1; j < n; j++) {
                //当j>i+1的时候才判断是否要去重
                if(j > i + 1 &&nums[j] == nums[j-1]){
                    continue;
                }

                //第三个指针指向数组末尾
                int k = n - 1;
                int target = -nums[i];
                //因为排序过了，当nums[j] + nums[k] > target 的时候就k--，如果 nums[j] + nums[k] < target 就j++
                while(j < k && nums[j] + nums[k] > target){
                    k--;
                }
                //如果两端指针碰撞，则找不到i位置能满足条件的情况
                if(j == k){
                    break;
                }

                if(nums[j] + nums[k] == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,-1,0,1,2};
        threeSum(nums);
    }
}
