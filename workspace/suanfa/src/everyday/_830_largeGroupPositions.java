package everyday;

import java.util.ArrayList;
import java.util.List;

public class _830_largeGroupPositions {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> groups = new ArrayList<>();
        int i = 0;
        while (i < s.length() - 2) {
            int length = 1;
            int j = i;
            while (j < s.length() - 1) {
                if (s.charAt(j) == s.charAt(j + 1)) {
                    j++;
                    length++;
                } else {
                    break;
                }
            }
            if (length >= 3) {
                List<Integer> group = new ArrayList<>();
                group.add(i);
                group.add(j);
                groups.add(group);
            }
            i += length;
        }
        return groups;
    }

    public static void main(String[] args) {
        _830_largeGroupPositions largeGroupPositions = new _830_largeGroupPositions();
        largeGroupPositions.largeGroupPositions("abbxxxxzzy");
    }
}
