package everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _452_findMinArrowShots {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        int pos = points[0][1];
        int ans = 1;
        for (int[] ball :
                points) {
            if (ball[0] > pos) {
                pos = ball[1];
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        _452_findMinArrowShots findMinArrowShots = new _452_findMinArrowShots();
        System.out.println(findMinArrowShots.findMinArrowShots
                (new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}));
    }
}
