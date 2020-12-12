package Sort;

public class Insertion {
    public static void insertion(int[] nums){
        int i,j;
        int target;
        int n = nums.length;
        for ( i = 1; i < n; i++) {
            target = nums[i];
            j = i;
            while(j>0&&target < nums[j -1]){
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = target;
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{12,2135,256,45,1,5,2,6,2};
        insertion(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
