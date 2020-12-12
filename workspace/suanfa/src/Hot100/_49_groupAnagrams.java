package Hot100;

import java.util.*;

public class _49_groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        //创建一个map用来存放String和List
        HashMap<String, List> map = new HashMap<>();
        //对字符串数组进行遍历
        for (String str :
                strs) {
            //将字符串转换成字符数组
            char[] chs = str.toCharArray();
            //对字符数组进行重新排序，这样异位词就有相同的排列
            Arrays.sort(chs);
            //将字符数组转化成String，作为之前map的key
            String key = String.valueOf(chs);
            //如果map不包含这个key，那么将key加入map，并且新建一个List
            if (!map.containsKey(key)) map.put(key, new ArrayList());
            //map通过key获得List，将字符串加入List中
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}