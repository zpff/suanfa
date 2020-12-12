package Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        StringBuilder sb = new StringBuilder();
        while(!(s = sc.nextLine()).equals("end")){
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
