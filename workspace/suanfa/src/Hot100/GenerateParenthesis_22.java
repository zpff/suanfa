package Hot100;

import Practice.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenerateParenthesis_22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTrack(list,n,new StringBuilder(),0,0);
        return list;
    }

    private void backTrack(List<String> list, int n, StringBuilder stringBuilder, int left, int right) {
        if(stringBuilder.length() == 2*n){
            list.add(stringBuilder.toString());
            return;
        }
        //当添加的左括号少于右括号时，不合法，直接返回
        if(left < right) return;
        //每次先添加左括号
        if(left < n){
            stringBuilder.append("(");
            backTrack(list,n,stringBuilder,left + 1,right);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        if(right < n){
            stringBuilder.append(")");
            backTrack(list,n,stringBuilder,left,right + 1);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis_22 generateParenthesis22 = new GenerateParenthesis_22();
        generateParenthesis22.generateParenthesis(3);
    }
}
