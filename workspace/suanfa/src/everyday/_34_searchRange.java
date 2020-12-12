package everyday;

public class _34_searchRange {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int left = findFirstIndex(nums, target);
        if (left == -1) return new int[]{-1, -1};
        int right = findLastIndex(nums, target);
        return new int[]{left, right};

    }

    private int findLastIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (nums[right] == target) return right;
        return -1;
    }

    private int findFirstIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left != nums.length && nums[left] == target) {
            return left;
        }
        return -1;
    }

    public static void main(String[] args) {
        _34_searchRange searchRange = new _34_searchRange();
        System.out.println(searchRange.searchRange(new int[]{5,7,7,8,8,10} , 8));
    }
}
