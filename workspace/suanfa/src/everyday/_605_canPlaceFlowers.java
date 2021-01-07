package everyday;

public class _605_canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length <= 1) {
            if (n > 1) return false;
            if (flowerbed[0] == 0) return true;
            return false;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0 && flowerbed[1] == 0&&flowerbed[0] == 0) {
                flowerbed[0] = 1;
                n--;
            }
            if(i == flowerbed.length - 1 && flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
            if (i > 0 && i <flowerbed.length - 1 && flowerbed[i -1] == 0 && flowerbed[i +1] == 0 && flowerbed[i] ==0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
