import java.util.*;
 public class Main {
    public static void main(String[] args) {
         Scanner x = new Scanner(System.in);
         System.out.println("enter the size of array");
         int m = x.nextInt();
        int n = x.nextInt();

        int[][] arr = new int[m][n];
        
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
            arr[i][j]=x.nextInt();


        }
    }
    System.out.println("The entered array is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        x.close();
    }
}
