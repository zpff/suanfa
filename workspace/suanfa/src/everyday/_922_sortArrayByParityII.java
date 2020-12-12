package everyday;

public class _922_sortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int n = A.length;
        int p0 = 0;
        int p1 = 1 ;
        while (p0 < n) {
            //int p1 = 1 ;
            if (isOdd(A[p0])) {
                while (p1 < n&&isOdd(A[p1])) {
                        p1 += 2;
                }
                int tmp = A[p0];
                A[p0] = A[p1];
                A[p1] = tmp;
            }
            p0+=2;
        }
        return A;
    }

    public boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,1,0,1,0};
        _922_sortArrayByParityII sortArrayByParityII = new _922_sortArrayByParityII();
        sortArrayByParityII.sortArrayByParityII(nums);
    }

}
