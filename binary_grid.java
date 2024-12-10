import java.util.*;
public class array {
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int rows = x.nextInt();
       int cols = x.nextInt();
       int arr[][] = new int[rows][cols];
       for(int i =0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr[i][j] = x.nextInt();

        }
       }
       for(int i =1;i<rows-1;i++){
        for(int j =1;j<cols-1;j++){
            if(arr[i][j]==0){
                if(arr[i][j-1]!=0 && arr[i][j+1]!=0 && arr[i+1][j]!=0 && arr[i-1][j]!=0){
                    System.out.println(i+" "+j);
                }
            }
        }
       }
        x.close();
     }
    
}
