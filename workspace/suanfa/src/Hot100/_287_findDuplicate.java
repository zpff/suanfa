package Hot100;

public class _287_findDuplicate {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int left = 1;
        int right = len - 1;
        while (left < right){
            int mid = left + (right - left ) / 2;
            int count = 0;
            for (int num:
                 nums) {
                if (num <= mid){
                    count ++;
                }
            }
            if (count > mid){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        _287_findDuplicate findDuplicate = new _287_findDuplicate();
        System.out.println(findDuplicate.findDuplicate(new int[]{3,1,3,4,2}));
    }
}
