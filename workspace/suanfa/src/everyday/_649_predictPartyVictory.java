package everyday;

import java.util.LinkedList;
import java.util.Queue;

public class _649_predictPartyVictory {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> Radiant = new LinkedList<>();
        Queue<Integer> Dire = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R'){
                Radiant.offer(i);
            }else {
                Dire.offer(i);
            }
        }
        while (!Radiant.isEmpty()&&!Dire.isEmpty()){
            int r = Radiant.poll();
            int d = Dire.poll();
            if (r < d){
                Radiant.offer(r + n);
            }else {
                Dire.offer(d + n);
            }
        }
        return Radiant.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        _649_predictPartyVictory predictPartyVictory = new _649_predictPartyVictory();
        System.out.println(predictPartyVictory.predictPartyVictory("RDD"));
    }
}
