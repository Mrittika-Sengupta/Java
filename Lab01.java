
package lab01;
import java.util.Scanner;
/**
 *
 * @author Mrittika
 */
public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
// System.in refers to the input stream in the console
Scanner input = new Scanner(System.in);
System.out.println("Please enter an integer: ");
int userGivenInteger = input.nextInt();
input.nextLine(); // consume the newline character
System.out.println(userGivenInteger);
System.out.println("Please enter any string: ");
String userGivenString = input.nextLine();
System.out.println(userGivenString);
input.close();
}
}
 
    

