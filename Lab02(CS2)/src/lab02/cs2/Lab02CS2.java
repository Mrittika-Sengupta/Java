
package lab02.cs2;

import java.util.Scanner;


public class Lab02CS2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num1 = input.nextInt();
        System.out.println("Please entered" +num1);
        int num2 = input.nextInt();
        System.out.println("Please entered" +num2);
        if (num1>num2){
             System.out.println(num1 + "is greater than" +num2);
            
        }else if(num2>num1) {
             System.out.println(num2+"is greater" +num1);
        } else{
             System.out.println(num1+" and " +num2+ "are equal");
        }
    }
    
}
