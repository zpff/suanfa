package everyday;

public class _134_canCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentGas = 0;
        int step = gas.length;
        for (int i = 0; i < gas.length; i++) {
            int currentpoit = i;
            while (step > 0){
                currentGas += gas[currentpoit];
                currentGas -= cost[currentpoit];
                if(currentGas < 0) break;
                currentpoit++;
                if(currentpoit>=gas.length){
                    currentpoit = currentpoit%gas.length;
                }
                step--;
            }
            if (step == 0) return i;
            currentGas = 0;
            step = gas.length;
        }
        return -1;
    }

    public static void main(String[] args) {
        /*int[] gas = {1,2,3,4,3,2,4,1,5,3,2,4};
        int[] cost = {1,1,1,3,2,4,3,6,7,4,3,1};*/
        int[] gas = {3,3,4};
        int[] cost = {3,4,4};
        _134_canCompleteCircuit canCompleteCircuit = new _134_canCompleteCircuit();
        System.out.println(canCompleteCircuit.canCompleteCircuit(gas,cost));
    }
}
