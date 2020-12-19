package Hot100;

public class _461_hammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int distance = 0;
        while(xor != 0){
            distance += 1;
            xor = xor &(xor-1);
        }
        return distance;
    }
}
