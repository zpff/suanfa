package String;


import java.util.ArrayList;
import java.util.List;

//6.Z字形变换
public class Convert {
    public String convert(String s, int numRows) {
        //当设置的行数为1时，直接返回字符串
        if (numRows == 1) return s;
        //取行数和字符串长度创建StringBuilder，并且将它们添加到集合中
        List<StringBuilder> sb = new ArrayList<>();
        for (int i = 0; i <Math.min(numRows,s.length()) ; i++) {
            sb.add(new StringBuilder());
        }

        //表示当前要添加在第几行
        int curRow = 0;
        //是否要换方向
        boolean goingDown = false;

        //遍历字符串
        for (char c: s.toCharArray()) {
            sb.get(curRow).append(c);
            //如果当前行是第0行或者是最大的那一行时，需要转变方向
            if (curRow == 0 || curRow == numRows -1){
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder stringBuilder: sb
             ) {
            ret.append(stringBuilder);
        }
        return ret.toString();
    }
}
