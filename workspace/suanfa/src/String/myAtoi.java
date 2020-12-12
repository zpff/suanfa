package String;

//8.字符串装换整数
public class myAtoi {
    public int myAtoi(String s) {
        //先判断字符长度是否为0
        if(s.length() == 0) return 0;

        char[] chars = s.toCharArray();
        int index = 0;
        //找到第一个非空字符的下标
        while(index < chars.length && chars[index] == ' '){
            index++;
        }
        //如果非空字符后面没了，返回0
        if (index == chars.length) {
            return 0;
        }

        //判断第一个非空字符是否是正负号
        int sign = 1;
        if(chars[index] == '+'){
            index++;
        }else if(chars[index] == '-'){
            sign = -1;
            index++;
        }

        //如果正负号后面没有了，返回0
        if (index == chars.length) {
            return 0;
        }
        //第一个非空字符是否是数字
        if(chars[index] <'0' || chars[index] >'9') return 0;

        //拼接数字
        int res = 0;
        while(index < chars.length && chars[index] >= '0' && chars[index] <= '9'){
            if(sign == 1 && res > Integer.MAX_VALUE/10 ||
                    //因为是字符数组，所以比较必须比较字符
                    (sign == 1 && res == Integer.MAX_VALUE/10 && chars[index] > '7')) return Integer.MAX_VALUE;
            if (sign == -1 && res > Integer.MAX_VALUE/10 ||
                    (sign == -1 && res == Integer.MAX_VALUE/10 && chars[index] > '8')) return Integer.MIN_VALUE;
            //要用当前字符减去'0'，否则加上的是ASCLL码
            res = res * 10 + chars[index] - '0';
            index++;
        }
        return res * sign;
    }
}
