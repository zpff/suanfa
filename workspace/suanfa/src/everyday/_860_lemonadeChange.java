package everyday;

import sun.font.FontRunIterator;

import java.util.HashMap;

public class _860_lemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> bucket = new HashMap<>();
        for (int money:
             bills) {
            if (money == 5){
                bucket.put(5,bucket.getOrDefault(5,0) + 1);
            }else if (money == 10){
                if (bucket.getOrDefault(5,0) < 1){
                    return false;
                }else {
                    bucket.put(5,bucket.get(5) - 1);
                    bucket.put(10,bucket.getOrDefault(10,0) + 1);
                }
            }else {
                if(bucket.getOrDefault(10,0) > 0 &&
                        bucket.getOrDefault(5,0) > 0){
                    bucket.put(5,bucket.get(5) - 1);
                    bucket.put(10,bucket.get(10) - 1);
                    continue;
                }else if(bucket.getOrDefault(5,0) > 2){
                    bucket.put(5,bucket.get(5) - 3);
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
