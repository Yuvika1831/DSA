//FIND SQUARE ROOT OF A NUMBER
import java.util.*;

public class functions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();

        
        for (int i = 0; i * i <= num; i++) {
            if (i * i == num) {
                System.out.println("Square root of " + num + " is: " + i);
                return;  
            }
        }

        
        System.out.println("No square root exists for the given number.");
        
        input.close();
    }
}
