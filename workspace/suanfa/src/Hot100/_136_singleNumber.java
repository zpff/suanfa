package Hot100;

import javax.swing.text.StyledEditorKit;
import java.util.HashSet;

public class _136_singleNumber {
    //hashset
    /*public int singleNumber(int[] nums) {
        HashSet<Integer> single = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!single.contains(nums[i])){
                single.add(nums[i]);
            }else {
                single.remove(nums[i]);
            }
        }
        Integer[] theSingle = single.toArray(new Integer[]{});
        return theSingle[0];
    }*/
    //位运算，一个数异或本身等于0，异或0等于本身，符合结合律
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num:
             nums) {
            single ^=num;
        }
        return single;
    }

    public static void main(String[] args) {
        String a = "abcdefg";
        System.out.println(a.substring(0,1));
    }
}
