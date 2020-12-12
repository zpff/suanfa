package Sort;

public class _75_sortColors {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int p0 = 0;
        int p2 = n - 1;
        for (int i = 0; i <= p2; i++) {
            while(i<=p2&&nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[p2];
                nums[p2] = temp;
                p2--;
            }
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                p0++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,1,0,1,2,1,0,0,1,2};
        _75_sortColors.sortColors(nums);
        for (int num:
             nums) {
            System.out.print(num+" ");
        }
    }
}
