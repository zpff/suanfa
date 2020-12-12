package everyday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _973_kClosest {
    public int[][] kClosest(int[][] points, int K) {
        //排序
        /*Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]*o1[0]+o1[1]*o1[1]-o2[0]*o2[0]-o2[1]*o2[1];
            }
        });
        return Arrays.copyOfRange(points,0,K);
    }*/
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        for (int i = 0; i < K; i++) {
            pq.offer(new int[]{points[i][0] * points[i][0] + points[i][1] * points[i][1], i});
        }
        int n = points.length;
        for (int i = K; i < n; i++) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            if (dist < pq.peek()[0]) {
                pq.poll();
                pq.offer(new int[]{dist, i});
            }
        }

        int[][] ans = new int[K][2];
        for (int i = 0; i < K; i++) {
            ans[i] = points[pq.poll()[1]];
        }
        return ans;
    }
}