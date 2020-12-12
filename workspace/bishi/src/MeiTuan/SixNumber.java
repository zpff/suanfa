package MeiTuan;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SixNumber {
    public static boolean sixNumber(int number){
        String numberToString = String.valueOf(number);
        String[] n = numberToString.split("");
        int[] numbers = new int[n.length];
        for (int i = 0; i <n.length ; i++) {
            numbers[i] = Integer.parseInt(n[i]);
        }
        if(numbers[0]==0||numbers[2]==0||numbers[4]==0) return false;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!hs.contains(numbers[i])) {
                hs.add(numbers[i]);
            }else {
                return false;
            }
        }
        if (numbers[0]*10+numbers[1]+numbers[2]*10+numbers[3]
                !=numbers[4]*10+numbers[5]) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sixNumber(101010));
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] range = text.split(" ");
        int count = 0;
        for (int i = Integer.parseInt(range[0]); i <=Integer.parseInt(range[1]) ; i++) {
            if (sixNumber(i)) count++;
        }
        System.out.println(count);
    }

}
