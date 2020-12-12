package everyday;

public class _376_wiggleMaxLength {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n < 2) return n;
        int prediff = nums[1] - nums[0];
        int ret = prediff != 0 ? 2:1;
        for (int i = 2; i < n; i++) {
            int diff = nums[i] - nums[i-1];
            if (diff < 0 && prediff >= 0 ||diff > 0 && prediff <= 0){
                ret++;
                prediff = diff;
            }
        }
        return ret;
    }
}
