package everyday;

import java.util.Arrays;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int[] ans = new int[2001];
        int index ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                index = -arr[i] +1000;
            }else {
                index = arr[i];
            }
            ans[index]++;
        }
        Arrays.sort(ans);
        for (int i = 0; i < ans.length; i++) {
            if(ans[i] != 0 && ans[i] == ans[i-1]){
                return false;
            }
        }
        return true;
    }
}
