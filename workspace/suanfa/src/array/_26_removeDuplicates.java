package array;

public class _26_removeDuplicates {
    //找到和当前不相等的数，然后将它的值赋给当前数后面一个
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        int p = 0;
        int q = 1;
        while(q<nums.length){
            if(nums[p] != nums[q]){
                nums[p+1] = nums[q];
                p++;
             }
            q++;
        }
        return p+1;
    }
}
