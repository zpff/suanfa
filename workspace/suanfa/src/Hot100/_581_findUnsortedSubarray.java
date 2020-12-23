package Hot100;

import java.util.Arrays;

public class _581_findUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] snums = nums.clone();
        Arrays.sort(snums);
        int start = nums.length;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != snums[i]){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }
        return end - start > 0 ? end - start + 1 : nums.length;
    }
}
