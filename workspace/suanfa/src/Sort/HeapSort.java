package Sort;

public class HeapSort {
    public void heapSort(int[] nums){

        int len = nums.length;
        bulidMaxHeap(nums,len);
        for (int i = len-1; i >=0 ; i--) {
            swap(nums,0,i);
            len--;
            heapify(nums,0,len);
        }
    }

    private static void bulidMaxHeap(int[] nums,int len) {
        for (int i = len -1; i >= 0 ; i--) {
            heapify(nums,i,len);
        }
    }

    private static void heapify(int[] nums, int i,int len) {
        int left = i*2+1;
        int right = i*2+2;
        int largest = i;
        if(left < len && nums[left] > nums[largest]){
            largest = left;
        }
        if(right < len && nums[right] > nums[largest]){
            largest = right;
        }
        if (largest != i){
            swap(nums,largest,i);
            heapify(nums,largest,len);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        HeapSort hp = new HeapSort();
        hp.heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
