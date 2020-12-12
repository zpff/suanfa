package Hot100;

import java.util.Arrays;

public class _169_majorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2+1];
    }
}
