package TwoPointer;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        //先对数组进行排序
        Arrays.sort(nums);
        //用来保存最接近的和
        int best = 100000;
        int length = nums.length;
        //第一层循环，边界为倒数第三个数
        for (int i = 0; i < length - 2; i++) {
            if(i>0&&nums[i] == nums[i - 1]){
                continue;
            }
            int j = i+1;
            int k = length - 1;
            //第二层循环，双指针，指针碰撞时停止
            while (j < k){
                int sum = nums[i]+nums[j]+nums[k];
                //如果和正好等于目标值，直接返回目标值
                if(sum == target){
                    return target;
                }
                //如果当前和与目标值差的绝对值比之前小，那么替换
                if(Math.abs(sum - target) < Math.abs(best-target)){
                    best = sum;
                }
                //如果当前和大于目标值右边指针左移
                if(sum > target){
                    k--;
                }
                //如果当前和小于目标值左边指针右移
                if(sum < target){
                    j++;
                }
            }
        }
        return best;
    }
}
