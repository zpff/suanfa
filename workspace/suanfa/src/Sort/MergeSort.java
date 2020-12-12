package Sort;

public class MergeSort {
    public static void merge(int[] a,int low, int mid,int high){
        int[] tmp = new int[high-low+1];
        int i = 0;
        int j =low;
        int k = mid +1;
        while(j<=mid&&k<=high){
            if(a[j]<=a[k]){
                tmp[i++] = a[j++];
            }else {
                tmp[i++] = a[k++];
            }
        }
        while (j<=mid){
            tmp[i++] = a[j++];
        }
        while(k<=high){
            tmp[i++] = a[k++];
        }
        for (int l = 0; l <tmp.length; l++) {
            a[low+l] = tmp[l];
        }
    }
    public static void mergeSort(int[] a,int low,int high){
        int mid = low +(high-low)/2;
        if(low < high){
            mergeSort(a,low,mid);
            mergeSort(a,mid + 1,high);
            merge(a,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
