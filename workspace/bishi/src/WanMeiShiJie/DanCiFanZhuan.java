package WanMeiShiJie;

import com.sun.deploy.ui.FancyButton;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Scanner;

public class DanCiFanZhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split("_");
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            res = res+"_"+fanZhuan(strs[i]);
        }
        System.out.println(res.substring(1));
    }
    public static String fanZhuan(String str){
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }

}
