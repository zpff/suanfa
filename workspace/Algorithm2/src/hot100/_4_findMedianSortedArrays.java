package hot100;

import java.util.Arrays;

public class _4_findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            nums[i] = nums1[i];
        }
        for (int i = nums1.length; i < nums.length; i++) {
            nums[i] = nums2[i-nums1.length];
        }
        Arrays.sort(nums);
        double res = 0;
        int mid1 = nums.length/2;
        if (nums.length % 2 ==0){
            int mid2 = nums.length/2 - 1;
            res = ((double)nums[mid1] + (double)nums[mid2])/2;
        }
        if (nums.length % 2 == 1){
            res = (double)nums[mid1];
        }
        return res;
    }
}
