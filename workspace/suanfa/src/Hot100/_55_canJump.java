package Hot100;

public class _55_canJump {
    /*public boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;
        int n = nums.length;
        //表示最远能到达的地方
        int mostArrive = 0;
        //对每个数进行遍历
        for (int i = 0; i < n - 1; i++) {
            //如果当前位置小于等于最远到达的地方（很关键，如果当前位置在之前能最远到达的位置后，直接跳过）
            if (i <= mostArrive) {
                //更新最远能到达的地方为，当前位置加上当前位置能走的长度和之前能到达的最远位置的最大值
                mostArrive = Math.max(nums[i] + i, mostArrive);
            }
            //当最远能到达的位置大于等于最后一个位置时，那么返回true
            if (mostArrive >= n - 1) {
                return true;
            }
        }
        //遍历到最后返回false
        return false;
    }*/

}
