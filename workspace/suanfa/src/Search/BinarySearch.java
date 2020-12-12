package Search;
//非递归二分查找
public class BinarySearch {
    public static int binarySearch(int[] nums,int key){
        //指向最低位的指针
        int low = 0;
        //指向最高位的指针
        int high = nums.length-1;
        while(low <= high){
            //二分查找的位置
           int mid = low + (high-low)/2;
           if(key < nums[mid]) high = mid -1;
           if(key > nums[mid]) low = mid +1 ;
           else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(binarySearch(nums,3));
    }
}
