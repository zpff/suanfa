package Hot100;

import Search.BinarySearch;

public class Search_33 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            //只在有序的时候进行判断
            if (nums[left] <= nums[mid]) {
                //判断target是否在这段有序数组里
                if (nums[left] <= target && target <= nums[mid]) {
                    //是的话，就在这里寻找
                    right = mid - 1;
                } else {
                    //不是的话在后面一段寻找
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

}
