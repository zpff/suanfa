package hot100;

import java.util.*;

public class _49_groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for (String s:
             strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        groups.addAll(map.values());
        return groups;
    }
}
