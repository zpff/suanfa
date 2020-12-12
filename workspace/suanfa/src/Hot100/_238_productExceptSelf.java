package Hot100;

public class _238_productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] L = new int[length];
        int[] R = new int[length];

        int[] ans = new int[length];

        L[0] = 1;

        for (int i = 1; i < length; i++) {
            //左边的数的值乘以左边的数的左边数乘积
            L[i] = nums[i-1] * L[i -1];
        }

        R[length - 1] = 1;
        for (int i = length - 2; i >= 0 ; i--) {
            R[i] = nums[i+1] * R[i+1];
        }

        for (int i = 0; i < length; i++) {
            ans[i] = L[i] * R[i];
        }
        return ans;
    }
}
