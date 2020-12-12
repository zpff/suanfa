package BanYu;

public class BaseNeg2 {
    public String baseNeg2(int N) {
        // write code here
        StringBuilder sb = new StringBuilder();
        while(N != 0){
            int mod = N%(-2);
            N/=-2;
            if (mod == -1){
                sb.append(1);
                N++;
            }else {
                sb.append(mod);
            }
        }
        return sb.length() == 0 ? "0" : sb.reverse().toString();
    }
}
