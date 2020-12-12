package String;
//12. 整数转罗马数字
public class IntToRoman {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strings = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        //第一层循环指向values数组
        for (int i = 0; i < values.length && num > 0; i++) {
            //当num减去当前values[i]的值依然大于values[i]，继续减并拼接
            while(values[i] <= num){
                num -= values[i];
                sb.append(strings[i]);
            }
        }
        return sb.toString();
    }
}
