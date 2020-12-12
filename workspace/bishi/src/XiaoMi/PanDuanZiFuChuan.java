package XiaoMi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


/*
给定一个只包括'(',')','{','}','[',']' 的字符串,判断字符串是否有效。

有效字符串需满足:

   1.左括号必须用相同类型的右括号闭合。

   2. 左括号必须以正确的顺序闭合。

注意空字符串可被认为是有效字符串。


()[]{}
([)]
{[]}


true
false
true

 */
public class PanDuanZiFuChuan {
    public static boolean panDuanZiFuChuan(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> m = new HashMap<>();
        m.put(')','(');
        m.put('}','{');
        m.put(']','[');
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if(tmp == '('||tmp == '['|| tmp=='{'){
                stack.push(s.charAt(i));
            }else {
                char temp = m.get(tmp);
                if(stack.isEmpty()){
                    return false;
                }if (temp!=stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String s = sc.nextLine();
            System.out.println(panDuanZiFuChuan(s));
        }
    }
}
