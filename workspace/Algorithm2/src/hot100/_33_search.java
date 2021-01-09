package hot100;

public class _33_search {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if (target == nums[mid]){
                return mid;
            }
            if(nums[left] <= nums[mid]){
                if (target <= nums[mid] && target >= nums[left]){
                    right = mid - 1;
                }else {
                    left = mid +1;
                }
            }else {
                if (target >= nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else {
                    right = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _33_search search = new _33_search();
        search.search(new int[]{3,1},1);
    }
}
