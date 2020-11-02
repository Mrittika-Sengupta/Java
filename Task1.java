
package task.pkg1;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


System.out.println("Please enter your name: ");
String yourname = input.nextLine();
System.out.println(yourname);
System.out.println("Please enter your age: ");
int yourage = input.nextInt();
input.nextLine(); // consume the newline character
System.out.println(yourage);
System.out.println("Please enter your department: ");
String yourdepartment = input.nextLine();
System.out.println(yourdepartment);
        

input.close();
    }
    
}
