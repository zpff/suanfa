package Sort;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, t;

        if (low > high) {
            return;
        }

        i = low;
        j = high;
        temp = arr[low];
        while (i < j) {
            //从右往左找比基准数小的数的下标
            while (arr[j] >= temp && i < j) {
                j--;
            }
            //从左往右找比基准数大的数的下标
            while (arr[i] <= temp && i < j) {
                i++;
            }
            //交换这两个数的位置
            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        //当i==j的时候，交换基准数与相等位置的数
        arr[low] = arr[i];
        arr[i] = temp;

        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        /*int a = Integer.parseInt("001");
        System.out.println(a);*/

    }

}
