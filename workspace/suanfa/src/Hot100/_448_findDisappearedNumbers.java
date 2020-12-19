package Hot100;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _448_findDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disapperNumbers = new ArrayList<>();
        HashSet<Integer> apperNumbers = new HashSet<>();
        for (int num:
             nums) {
            apperNumbers.add(num);
        }
        for (int i = 1; i < nums.length; i++) {
            if (!apperNumbers.contains(i)){
                disapperNumbers.add(i);
            }
        }
        return disapperNumbers;
     }
}
