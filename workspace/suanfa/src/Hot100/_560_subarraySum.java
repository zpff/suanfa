package Hot100;


import java.util.HashMap;

public class _560_subarraySum {
    //暴力
    /*public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int j = i;
            while (j < nums.length){
                sum += nums[j];
                j++;
                if (sum == k) count++;
                if (sum > k) break;
            }

        }
        return count;
    }*/
    //前缀和
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        _560_subarraySum subarraySum = new _560_subarraySum();
        System.out.println(subarraySum.subarraySum(new int[]{1},0));
    }
}
