package Hot100;

public class _215_findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        buildMaxHeap(nums,len);
        for (int i = len - 1; i >= nums.length - k +1; i--) {
            swap(nums,0,i);
            len--;
            heapify(nums,0,len);
        }
        return nums[0];
    }

    private void buildMaxHeap(int[] nums, int len) {
        for (int i = len / 2 -1; i >= 0; i--) {
            heapify(nums,i,len);
        }
    }

    private void heapify(int[] nums, int i, int len) {
        int left = i*2+1;
        int right = i*2+2;
        int largestIndex = i;

        if(left < len && nums[left] > nums[largestIndex]){
            largestIndex = left;
        }

        if(right < len && nums[right] > nums[largestIndex]){
            largestIndex = right;
        }

        if(largestIndex != i){
            swap(nums,i,largestIndex);
            heapify(nums,largestIndex,len);
        }

    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        _215_findKthLargest findKthLargest = new _215_findKthLargest();
        System.out.println(findKthLargest.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }

}
