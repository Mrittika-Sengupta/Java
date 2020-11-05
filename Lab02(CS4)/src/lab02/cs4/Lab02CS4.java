
package lab02.cs4;
import java.util.Scanner;


public class Lab02CS4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = input.next().charAt(0);
        switch (ch){
            case 'a' :
                System.out.println("You have entered a");
                break;
                 case 'b' :
                System.out.println("You have entered b");
                break;
                 case 'c' :
                System.out.println("You have entered c");
                break;
                 default:
                     System.out.println("You have entered anything else");
        }
    }
    
}
