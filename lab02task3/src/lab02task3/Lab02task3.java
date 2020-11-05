
package lab02task3;
import java.util.Scanner;

/**
 *
 * @author Mrittika
 */
public class Lab02task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your BMI");
       
        double BMI = input.nextDouble();
        if (BMI<18.5){
            System.out.println("You're underweight ");
        } 
        else if  (BMI>=18.5 && BMI<=24.9){
            System.out.println("You're healthy");
                }
        else if (BMI>=25 && BMI<=29.9){
            System.out.println("You're overweight");
        }
        else if (BMI>=30 && BMI<=39.9){
        System.out.println("You're obese");
    } else{
            System.out.println("You have writing anything else");
        
        
        }
    }
}


