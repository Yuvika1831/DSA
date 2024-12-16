//RETURN THE INDEX OF ELEMENT DIVISIBLE BY 8
import java.util.*;
public class functions {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = input.nextInt();
        }
        for(int i =0;i<size;i++){
            if(arr[i]%8==0){
                System.out.println(i);
            }
        }

        input.close();
    }
}
