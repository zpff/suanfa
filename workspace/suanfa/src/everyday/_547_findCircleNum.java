package everyday;

import java.util.LinkedList;
import java.util.Queue;

public class _547_findCircleNum {
    //dfs
    /*public int findCircleNum(int[][] isConnected) {
        int provinces = isConnected.length;
        int circles = 0;
        boolean[] visited = new boolean[provinces];
        for (int i = 0; i < provinces; i++) {
            if (!visited[i]){
                dfs(isConnected,provinces,i,visited);
                circles++;
            }
        }
        return circles;
    }

    private void dfs(int[][] isConnected, int provinces, int i, boolean[] visited) {
        for (int j = 0; j < provinces; i++) {
            if (isConnected[i][j] == 1 && !visited[j]){
                visited[j] = true;
                dfs(isConnected,provinces,j,visited);
            }
        }
    }*/

    //并查集
    /*public int findCircleNum(int[][] isConnected) {
        int provinces = isConnected.length;
        int[] parent = new int[provinces];
        for (int i = 0; i < provinces; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < provinces; i++) {
            for (int j = i+1; j < provinces; j++) {
                if (isConnected[i][j] == 1){
                    union(parent,i,j);
                }
            }
        }
        int circles = 0;
        for (int i = 0; i < provinces; i++) {
            if (parent[i]!=i){
                circles++;
            }
        }
        return circles;
    }

    private void union(int[] parent, int i, int j) {
        parent[find(parent,i)] = find(parent,j);
    }

    private int find(int[] parent,int index){
        if (parent[index] != index){
            parent[index] = find(parent,parent[index]);
        }
        return parent[index];
    }*/

    //bfs
    public int findCircleNum(int[][] isConnected) {
        int provinces = isConnected.length;
        boolean[] visited = new boolean[provinces];

        Queue<Integer> queue = new LinkedList<>();
        int circles = 0;
        for (int i = 0; i < provinces; i++) {
            if (!visited[i]) {
                queue.offer(i);

                while (!queue.isEmpty()) {
                    int j = queue.poll();
                    for (int k = 0; k < provinces; k++) {
                        if (isConnected[j][k] == 1 && !visited[k]) {
                            visited[k] = true;
                            queue.offer(k);
                        }
                    }
                }
                circles++;
            }
        }
        return circles;
    }
}
