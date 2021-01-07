package hot100;

import java.util.ArrayList;
import java.util.List;

public class _22_generateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTrack(n,list,new StringBuilder(),0,0);
        return list;
    }

    private void backTrack(int n, List<String> list, StringBuilder stringBuilder,int left,int right) {
        if (stringBuilder.length() == 2 *n){
            list.add(stringBuilder.toString());
            return;
        }
        if (left<n){
            stringBuilder.append("(");
            backTrack(n,list,stringBuilder,left+1,right);
            stringBuilder.deleteCharAt(stringBuilder.length() -1);
        }
        if (right < n){
            stringBuilder.append(")");
            backTrack(n,list,stringBuilder,left,right+1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
