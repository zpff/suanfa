package hot100;

import java.util.HashMap;
import java.util.LinkedList;

public class _20_isValid {
    public boolean isValid(String s) {
        if (s.length() %2 == 1) return false;
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if (stack.isEmpty()||stack.peek()!=map.get(c)){
                    return false;
                } else {
                    stack.pop();
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
