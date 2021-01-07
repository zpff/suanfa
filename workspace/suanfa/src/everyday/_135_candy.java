package everyday;

import java.util.Arrays;

public class _135_candy {
    public int candy(int[] ratings) {
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for (int i = 1; i < left.length; i++) {
            if (ratings[i] > ratings[i-1]) left[i] = left[i-1] + 1;
        }
        int n = ratings.length;
        for (int i = n - 2; i >= 0 ; i--) {
            if (ratings[i] > ratings[i+1]) right[i] = right[i+1] + 1;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            count+= Math.max(left[i],right[i]);
        }
        return count;
    }
    /*public int candy(int[] ratings) {
        int lowRatingIndex = 0;
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] < ratings[lowRatingIndex]){
                lowRatingIndex = i;
            }
        }
        int[] candyArr = new int[ratings.length];
        candyArr[lowRatingIndex] = 1;
        int left = lowRatingIndex - 1;
        int i = lowRatingIndex;
        while (left >= 0){
            if (ratings[left] > ratings[i]){
                candyArr[left] = candyArr[i] + 1;
            }else {
                candyArr[left] = 1;
            }
            left--;
            i--;
        }
        int right = lowRatingIndex + 1;
        i = lowRatingIndex;
        while (right < candyArr.length){
            if (ratings[right] > ratings[i]){
                candyArr[right] = candyArr[i] + 1;
            }else {
                candyArr[right] = 1;
            }
            right++;
            i++;
        }
        int sum = 0;
        for (int candyNum:
             candyArr) {
            sum += candyNum;
        }
        return sum;
    }*/
    /*public int candy(int[] ratings) {
        int[] candyArr = new int[ratings.length];
        for (int i = 0; i < candyArr.length; i++) {
            candyArr[i] = 1;
        }
        if (ratings[0] > ratings[1]) candyArr[0]++;
        if (ratings[ratings.length-1] > ratings[ratings.length-2]) candyArr[ratings.length-1]++;
        for (int i = 1; i < ratings.length - 1; i++) {
            if (ratings[i] > ratings[i-1]){
                candyArr[i] = candyArr[i-1] +1;
            }
            if (ratings[i] > ratings[i+1]){
                candyArr[i] = candyArr[i+1] +1;
            }
            if (ratings[i] > ratings[i-1] && ratings[i] > ratings[i+1]){
                candyArr[i] =Math.max(candyArr[i-1],candyArr[i+1]) + 1;
            }
        }
        int sum = 0;
        for (int candyNum:
                candyArr) {
            sum += candyNum;
            System.out.print(candyNum+" ");
        }
        return sum;
    }*/
    public static void main(String[] args) {
        _135_candy candy = new _135_candy();
        System.out.println(candy.candy(new int[]{29,51,87,87,72,12}));
    }
}
