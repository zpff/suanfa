package String;
//14. 最长公共前缀
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length ==1){
            return "";
        }
        //将prefix设为第一个字符串，然后跟后面每一个字符串求公共前缀
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = commonPrefix(prefix,strs[i]);
            if(prefix == ""){
                break;
            }
        }
        return prefix;
    }
    public String commonPrefix(String str1,String str2){
        int length = Math.min(str1.length(),str2.length());
        int index = 0;
        //flower 和 flow 在0-3上相同，当index == 3 时，判断成功index++以后等于4，所以只要subString(0,4)就可以截出flow
        while(index < length && str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        return str1.substring(0,index);
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
