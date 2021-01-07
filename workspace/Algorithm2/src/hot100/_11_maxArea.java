package hot100;

public class _11_maxArea {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while (i < j){
            maxArea = Math.max(maxArea,(j - i) * Math.min(height[i],height[j]));
            if (height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return maxArea;
    }
}
