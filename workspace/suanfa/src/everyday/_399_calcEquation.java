package everyday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _399_calcEquation {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int equationSize = equations.size();
        Unionfind unionfind = new Unionfind( 2 * equationSize);
        HashMap<String,Integer> map = new HashMap<>();
        int id = 0;
        for (int i = 0; i < equationSize; i++) {
            List<String> list = equations.get(i);
            String var1 = list.get(0);
            String var2 = list.get(1);

            if (!map.containsKey(var1)){
                map.put(var1,id);
                id++;
            }
            if (!map.containsKey(var2)){
                map.put(var2,id);
                id++;
            }
            unionfind.union(map.get(var1),map.get(var2),values[i]);
        }
        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String var1 = queries.get(i).get(0);
            String var2 = queries.get(i).get(1);

            if (map.get(var1) == null || map.get(var2) == null){
                res[i] = -1.0d;
            }else {
                res[i] = unionfind.isConnected(map.get(var1),map.get(var2));
            }
        }
        return res;
    }
    public class Unionfind {
        int[] parent;

        double[] weight;

        public Unionfind(int n){
            parent = new int[n];
            weight = new double[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
                weight[i] = 1.0d;
            }
        }
        public Unionfind(){}

        public int find(int x){
            if(x!=parent[x]){
                int origin = parent[x];
                parent[x] = find(parent[x]);
                weight[x] = weight[origin] * weight[x];
            }
            return parent[x];
        }

        public void union(int x , int y , double value){
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY ){
                return;
            }
            parent[rootX] = rootY;
            weight[rootX] = weight[y] * value / weight[x];
        }

        public double isConnected(int x,int y){
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY){
                return weight[x] / weight[y];
            }
            return -1.0d;
        }
    }

    public static void main(String[] args) {
        _399_calcEquation calcEquation = new _399_calcEquation();
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        List<String> l3 = new ArrayList<>();
        List<String> l4 = new ArrayList<>();
        l1.add("x1");
        l1.add("x2");
        l2.add("x2");
        l2.add("x3");
        l3.add("x1");
        l3.add("x4");
        l4.add("x2");
        l4.add("x5");
        List<List<String>> equations = new ArrayList<>();
        equations.add(l1);
        equations.add(l2);
        equations.add(l3);
        equations.add(l4);
        double[] values = {3.0,0.5,3.4,5.6};
        List<String> q1 = new ArrayList<>();
        List<String> q2 = new ArrayList<>();
        List<String> q3 = new ArrayList<>();
        List<String> q4 = new ArrayList<>();
        List<String> q5 = new ArrayList<>();
        List<String> q6 = new ArrayList<>();
        List<String> q7 = new ArrayList<>();
        q1.add("x2");
        q1.add("x4");
        q2.add("x1");
        q2.add("x5");
        q3.add("x1");
        q3.add("x3");
        q4.add("x5");
        q4.add("x5");
        q5.add("x5");
        q5.add("x1");
        q6.add("x3");
        q6.add("x4");
        q7.add("x4");
        q7.add("x3");
        List<List<String>> queries = new ArrayList<>();
        queries.add(q1);
        queries.add(q2);
        queries.add(q3);
        queries.add(q4);
        queries.add(q5);
        queries.add(q6);
        queries.add(q7);
        calcEquation.calcEquation(equations,values,queries);
    }
}
