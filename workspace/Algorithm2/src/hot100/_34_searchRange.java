package hot100;

public class _34_searchRange {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1,-1};
        int left = findLeft(nums,target);
        if (left == -1 ) return new int[]{-1,-1};
        int right = findRight(nums,target);
        return new int[]{left,right};
    }

    private int findLeft(int[] nums,int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <=right){
            int mid = left + (right - left ) /2;
            if (target > nums[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left != nums.length && nums[left] == target) return left;
        return -1;
    }

    private int findRight(int[] nums , int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right ){
            int mid = left + (right - left ) /2;
            if (target < nums[mid]){
                right = mid -1;
            }else {
                left = mid +1;
            }
        }
        return right;
    }
}
