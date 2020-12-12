package everyday;

public class _283_moveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i; j < nums.length-1; j++) {
                if(nums[j] == 0){
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
    }
}
