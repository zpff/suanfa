package Hot100;

public class NextPermutation_31 {
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        int i = length - 2;
        //从后向前找到第一个有序的元素对一定要找到前一个小于后一个的，等于不行
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        //如果数组是倒序的，那么i将会等于-1
        if(i >=0 ) {
            int j = length - 1;
            //从后向前找到第一个大于nums[i]的数，等于不行
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            //交换这两个数
            swap(nums,i,j);
        }
        //将从i+1位置开始的数开始倒置，因为后面已经是倒序的了，所以只要头尾交换就能变成正序
        reverse(nums,i + 1);

    }

    private void reverse(int[] nums, int i) {
        int j = nums.length-1;
        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = 0;
        tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        NextPermutation_31 n = new NextPermutation_31();
        n.nextPermutation(new int[]{5,1,1});
    }
}
