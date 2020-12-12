package backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length() == 0){
            return list;
        }
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");


        backTrack(map,list,0,digits,new StringBuffer());
        return list;
    }

    private void backTrack(Map<Character, String> map, List<String> list, int index, String digits, StringBuffer stringBuffer) {
        //当前是最后一个数字的话，将拼接的字符串加入list中
        if(index == digits.length()){
            list.add(stringBuffer.toString());
            return;
        }
        //得到当前index对应的digit
        char digit = digits.charAt(index);
        //得到每一个数字对应的字符串
        String letter = map.get(digit);
        for (int i = 0; i < letter.length(); i++) {
            stringBuffer.append(letter.charAt(i));
            //递归调用将下一个数字的第i位添加进来
            backTrack(map,list,index+1,digits,stringBuffer);
            //回溯，当index遍历结束以后，将当前最后一位删掉，用于下一次循环
            stringBuffer.deleteCharAt(index);
        }
    }

    public static void main(String[] args) {
        LetterCombinations letterCombinations = new LetterCombinations();
        letterCombinations.letterCombinations("23");
    }
}
