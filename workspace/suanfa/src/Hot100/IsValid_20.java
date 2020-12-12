package Hot100;

import java.io.CharConversionException;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IsValid_20 {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        //用map存放对应的数据
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(stack.isEmpty() || stack.peek() != map.get(c)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        //（（ 当这种情况stack不为空，循环执行结束，为false
        return stack.isEmpty();
    }
}
