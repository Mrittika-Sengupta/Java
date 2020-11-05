
package lab02task2;
import java.util.Scanner;

/**
 *
 * @author Mrittika
 */
public class Lab02task2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();
        int i,count=0;
        for(i=2;i<number;i++)
        {
                if(number%i==0){
                
                    count++;
                    
                    break;
                }
                    
                }
        if(count==0){
        System.out.println(number+ "is a prime number");
        }
        else {
                System.out.println(number+ "is not a prime number");
        }
    }
    
}
