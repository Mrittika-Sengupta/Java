
package lab02.task1;
import java.util.Scanner;

/**
 *
 * @author Mrittika
 */
public class Lab02Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();
        switch(number%2){
            case 0:
                System.out.println(number+ "is an even number");
                break;
            case 1:
                System.out.println(number+ "is an odd number");
                break;
        }
    }
    
}
