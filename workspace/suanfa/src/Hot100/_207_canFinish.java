package Hot100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _207_canFinish {
    //广度优先遍历
    /*List<List<Integer>> edges;
    int[] numEdge;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        numEdge = new int[numCourses];
        for (int[] info:
                prerequisites) {
            edges.get(info[1]).add(info[0]);
            numEdge[info[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (numEdge[i] == 0){
                queue.offer(i);
            }
        }

        int visited = 0;
        while(!queue.isEmpty()){
            visited++;
            int point = queue.poll();
            for (int i:
                    edges.get(point)) {
                numEdge[i]--;
                if(numEdge[i] == 0){
                    queue.offer(i);
                }
            }

        }
        return visited == numCourses;
    }*/

    //深度优先遍历
    List<List<Integer>> edges;
    int[] visited;
    boolean valied = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        visited = new int[numCourses];
        for (int[] info:
             prerequisites) {
            edges.get(info[1]).add(info[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if(visited[i] == 0){
                dfs(i);
            }
        }
        return valied;
    }

    private void dfs(int i) {
        visited[i] = 1;
        for (int j:
             edges.get(i)) {
            if(visited[j] == 0){
                dfs(j);
                if(!valied){
                    return;
                }
            }else if(visited[j] == 1){
                valied = false;
                return;
            }
        }
        visited[i] = 2;
    }
}
