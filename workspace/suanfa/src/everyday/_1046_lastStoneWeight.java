package everyday;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _1046_lastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < stones.length; i++) {
            queue.offer(stones[i]);
        }
        while (queue.size()>1){
            int x = queue.poll();
            int y = queue.poll();
            int z = x - y;
            if (z != 0){
                queue.offer(z);
            }
        }
        return queue.isEmpty() ? 0 : queue.peek();
    }
}
