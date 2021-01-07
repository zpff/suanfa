package hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _17_letterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0) return list;
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        backtrack(list,map,0,digits,new StringBuilder());
        return list;
    }

    private void backtrack(List<String> list, HashMap<Character, String> map, int index,
                           String digits, StringBuilder stringBuilder) {
        if (index == digits.length()) {
            list.add(stringBuilder.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letter = map.get(digit);
        for (int i = 0; i < letter.length(); i++) {
            stringBuilder.append(letter.charAt(i));
            backtrack(list,map,index+1,digits,stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
