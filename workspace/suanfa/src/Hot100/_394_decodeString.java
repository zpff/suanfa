package Hot100;

import java.util.LinkedList;

public class _394_decodeString {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        LinkedList<Integer> stk_multi = new LinkedList<>();
        LinkedList<String> stk_str = new LinkedList<>();

        for (char c:
             s.toCharArray()) {
            if (c =='['){
                stk_multi.push(multi);
                stk_str.push(res.toString());
                multi = 0;
                res = new StringBuilder();
            }
            else if (c==']'){
                StringBuilder tmp = new StringBuilder();
                int cur_multi = stk_multi.pop();
                for (int i = 0; i < cur_multi; i++) {
                    tmp.append(res);
                }
                res = new StringBuilder(stk_str.pop() + tmp);
            }
            else if (c >= '0' && c <='9') multi = multi * 10 + Integer.parseInt(c+"");
            else res.append(c);
        }
        return res.toString();
    }
}
