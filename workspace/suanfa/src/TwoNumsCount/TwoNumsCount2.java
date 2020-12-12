package TwoNumsCount;

import java.util.HashMap;
import java.util.Map;

public class TwoNumsCount2 {
    public static int[] twoNumsCount2(int[] nums , int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int minus = target - nums[i];
            if(map.containsKey(minus)&&i != map.get(minus)){
                return new int[] {i , map.get(minus)};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoNumsCount2(nums,target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
    }
}
