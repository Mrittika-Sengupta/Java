
package lab02.cs5;
import java.util.Scanner;


public class Lab02CS5 {

    public static void main(String[] args) {
        while(true){
         Scanner input = new Scanner(System.in);
        System.out.println("Enter an  integer");
        int num1 = input.nextInt();
        System.out.println("Enter another integer");
        int num2 = input.nextInt();
        switch(num1){
            case 1 :
                System.out.println("You have entered " + num1 + "on outer switch");
                switch(num2){
                 case 1 :
                System.out.println("You have entered " + num2 + "on inner switch");
                break;
                
                 default:
                     System.out.println("You have entered " + num2 + "on outer switch ");
        }  break;
                
                 default:
                     System.out.println("You have entered " + num1 + "on outer switch ");
        
       
        }
        }
    }
}

    

