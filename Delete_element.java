// DELETE ELEMENT IN AN ARRAY AT GIVEN INDEX
import java.util.*;
 public class Main {
    public static void main(String[] args) {
         Scanner x = new Scanner(System.in);
         System.out.println("enter the size of array");
         
        int size = x.nextInt();
         int[] arr = new int[size]; 
        for(int i =0;i<size;i++){
            arr[i] = x.nextInt();
        }
        int index = x.nextInt();
        ;
        for(int i =index;i+1<size;i++){
            arr[i]= arr[i+1];
        }
        arr[size-1]=0;
        size --;
        for(int i :arr){
        System.out.print(i+" ");

}
            
        x.close();
    }
}
