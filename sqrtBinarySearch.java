// FIND SQRT OF A NUMBER USING BINARY SEARCH
import java.util.*;

public class functions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("Square root of a negative number is not a real number.");
            input.close();
            return;  
        }
        int low =0;
        int high = num;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid * mid ==num){
                System.out.println(mid);
                break;
            }
            else if(mid*mid<num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if (low > high) {
            System.out.println("No exact integer square root exists for the given number.");
        }
        
        input.close();
    }
}
