package Practice;

import java.util.Scanner;

public class P1_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] S = s.split(" ");
        int[] nums = new int[3];
        for (int i = 0; i < S.length; i++) {
            nums[i] = Integer.parseInt(S[i]);
        }
        if(nums[0]==nums[1]&&nums[1]==nums[2]){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

    }
}
