package everyday;

import java.util.HashMap;

public class _659_isPossible {
    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        HashMap<Integer,Integer> endMap = new HashMap<>();
        for (int num:
             nums) {
            countMap.put(num,countMap.getOrDefault(num,0) + 1);
        }
        for (int num:
             nums) {
            int count = countMap.getOrDefault(num,0);
            if (count > 0){
                if (endMap.getOrDefault(num - 1, 0) > 0){
                    countMap.put(num,count - 1);
                    endMap.put(num - 1, endMap.get(num - 1) - 1);
                    endMap.put(num,endMap.getOrDefault(num,0)+1);
                }else {
                    int count2 = countMap.getOrDefault(num + 1,0);
                    int count3 = countMap.getOrDefault(num + 2,0);
                    if(count2 > 0 && count3 > 0){
                        endMap.put(num + 2,endMap.getOrDefault(num + 2,0) + 1);
                        countMap.put(num,count -1);
                        countMap.put(num +1,count2 -1);
                        countMap.put(num + 2,count3 -1);
                    }else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
