package everyday;

import java.util.HashMap;

public class _454_fourSumCount {
    //超时
    /*public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < C.length; k++) {
                    for (int l = 0; l < D.length; l++) {
                        if(A[i]+B[j]+C[k]+D[l] == 0){
                            count++
                        }
                    }
                }
            }
        }
        return count;
    }*/
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> countAB = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                countAB.put(A[i]+B[j],countAB.getOrDefault(A[i]+B[j],0)+1);
            }
        }
        int count = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                if(countAB.containsKey(-C[i]-D[j])){
                    count += countAB.get(-C[i]-D[j]);
                }
            }
        }
        return count;
    }
}