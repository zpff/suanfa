package hot100;

public class _31_nextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if (i>=0) {
            int j = n - 1;
            while (j > i && nums[j] < nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums,i+1);
    }

    private void reverse(int[] nums, int i) {
        int j = nums.length -1;
        while (i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        _31_nextPermutation nextPermutation = new _31_nextPermutation();
        nextPermutation.nextPermutation(new int[]{5,1,1});
    }
}
