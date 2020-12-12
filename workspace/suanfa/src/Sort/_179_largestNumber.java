package Sort;

import javax.jnlp.ExtendedService;
import java.util.Arrays;
import java.util.Comparator;

public class _179_largestNumber {
    public class largerNumberComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            String a = o1 + o2;
            String b = o2 + o1;
            return b.compareTo(a);
        }
    }
    public String largestNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strings,new largerNumberComparator());

        if(strings[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }
}
