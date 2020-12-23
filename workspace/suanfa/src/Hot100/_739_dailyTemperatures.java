package Hot100;

public class _739_dailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int[] arr = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            int j = i + 1;
            while (j < T.length && T[j] <= T[i]) {
                j++;
            }
            arr[i] = (j >= T.length ? 0 : j - i);
        }
        return arr;
    }
}
