package Sort;
//选择排序
public class Selection {
    public static void selection(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n -1; i++) {
            int min = i;
            for (int j = i+1; j <n ; j++) {
                if(nums[min] > nums[j]){
                    min = j;
                }
            }
            int tmp = nums[min];
            nums[min] = nums[i];
            nums[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12,2135,256,45,1,5,2,6,2};
        selection(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
