package everyday;

public class _941_validMountainArray {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3) return false;
        int mountain = 0;
        int mountainIndex = 0;
        for (int i = 1; i < A.length -1; i++) {
            if(A[i] > mountain){
                mountain = A[i];
                mountainIndex = i;
            }
            if(A[i-1] == A[i]){
                return false;
            }
        }
        for (int i = 1; i < mountainIndex + 1; i++) {
            if(A[i] <= A[i-1]){
                return false;
            }
        }
        for (int i = mountainIndex ; i < A.length - 1; i++) {
            if(A[i + 1] >= A[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _941_validMountainArray validMountainArray = new _941_validMountainArray();
        validMountainArray.validMountainArray(new int[]{0,3,2,1});
    }
}
