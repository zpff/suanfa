package Hot100;

public class _240_searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;
        while (col < matrix[0].length && row >= 0){
            if(matrix[row][col] < target){
                col++;
            }else if (matrix[row][col] > target){
                row--;
            }else {
                return true;
            }
        }
        return false;
    }
}
