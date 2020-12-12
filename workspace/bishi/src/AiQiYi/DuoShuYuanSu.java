package AiQiYi;


//给定一个大小为 n 的整数数组，找到其中的多数元素。多数元素是指在数组中出现次数大于『n/2』的元素。
//
//你可以假设数组是非空的，并且给定的数组总是存在多数元素。3 2 3     3

import java.util.Arrays;
import java.util.Scanner;

public class DuoShuYuanSu {
    public static int duoShuYuanSu(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] Strings = s.split(" ");
        int[] nums = new int[Strings.length];
        for (int i = 0; i < Strings.length; i++) {
            nums[i] = Integer.parseInt(Strings[i]);
        }
        System.out.println(duoShuYuanSu(nums));
    }
}
