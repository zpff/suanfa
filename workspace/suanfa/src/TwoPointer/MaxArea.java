package TwoPointer;

//11. 盛最多水的容器
public class MaxArea {
    public int maxArea(int[] height) {
        //两个指针指向左右端点
        int left = 0;
        int right = height.length - 1;

        int ans = 0;
        while(left < right){
            int area = Math.min(height[left],height[right]) * (right-left);
            ans = Math.max(ans,area);
            //如果左边矮，左指针右移，否则右指针左移
            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return ans;
    }
}
