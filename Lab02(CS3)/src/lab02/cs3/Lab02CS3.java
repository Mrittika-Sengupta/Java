
package lab02.cs3;
import java.util.Scanner;

public class Lab02CS3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer");
        int num = input.nextInt();
        if(num>=0){
             System.out.println("Your input is non-negative");
             if(num>=1){
                  System.out.println("Your input is also a natural number");
             }
            
        } else{
             System.out.println("Your input is negative number");
        }
        
    }
    
}
