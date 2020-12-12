package String;
//字符串压缩
public class CompressString {
    public  String compressString(String S) {
        int N = S.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        if (S.length() == 0) {
            return S;
        }
        int count = 0;
         while (i<S.length()) {
             int j = i;
             while(j<S.length()&&S.charAt(i)==S.charAt(j)){
                 j++;
                 count++;
             }
             sb.append(S.charAt(i));
             sb.append(count);
             i = j;
             count = 0;
         }

        return sb.length()<S.length()?sb.toString():S;
    }


//    public String compressString(String S) {
//        int N = S.length();
//        int i = 0;
//        StringBuilder sb = new StringBuilder();
//        while (i < N) {
//            int j = i;
//            while (j < N && S.charAt(j) == S.charAt(i)) {
//                j++;
//            }
//            sb.append(S.charAt(i));
//            sb.append(j - i);
//            i = j;
//        }
//
//        String res = sb.toString();
//        if (res.length() < S.length()) {
//            return res;
//        } else {
//            return S;
//        }
//    }

    public static void main(String[] args) {
        String S = "aabbc";
        CompressString compressString = new CompressString();
        System.out.println(compressString.compressString(S));
    }
}
