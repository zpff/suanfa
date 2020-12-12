package TwoNumsCount;

import java.util.LinkedList;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class TwoNumsCount {
    public int[] twoNumsCount(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        TwoNumsCount tnc = new TwoNumsCount();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        int[] result = tnc.twoNumsCount(nums,target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
    }
}
