package Practice;

public class P1_1_13 {

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[0].length; j++) {
                int temp = 0;
               temp = a[j][i];
               a[j][i] = a[i][j];
               a[i][j] = temp;
            }
        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }


    }
}

