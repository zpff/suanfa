package everyday;

public class _738_monotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        char[] strN = Integer.toString(N).toCharArray();
        int i = 1;
        while(i < strN.length && strN[i - 1] <= strN[i]){
            i++;
        }
        if(i < strN.length){
            while (i > 0 && strN[i - 1] > strN[i]){
                strN[i -1]--;
                i--;
            }
            for (i+= 1; i < strN.length; i++) {
                strN[i] = '9';
            }
        }
        return Integer.parseInt(String.valueOf(strN));
    }
}
