import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class Menu {
    Scanner userInput = new Scanner(System.in); //taking input using userinput object
    Calculator calc = new Calculator(); // taking object from calculator class
    
    
    public int showMenu(){
        System.out.println("press 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division");//basic statement for calculator
        System.out.println("choose your option");
        int a = userInput.nextInt(); //This function will basically return what the user has selected as 1,2 ,3 or 4
       
        if(a==1){
            return 1;
        }
        else if(a==2){
            return 2;
        }
        else if(a==3){
            return 3;
        }
        else if(a==4){
            return 4;
        }
        else{
            return -1; // return -1 for wrong input
        }
    }
    
    public void handleMenuInput(int menuInput){ //passing input from main method
        if(menuInput>=1 && menuInput<=4){ //giving range fro invalid input
            System.out.println("give first input "); // Take first double variable as user from menu class
            double m = userInput.nextDouble();
            System.out.println("give second input ");// Take second double variable as user from menu class
            double n = userInput.nextDouble();
            // calling method from calcutor class through menu
            if(menuInput==1){
                System.out.println("result "+calc.add(m, n));
            }
            else if(menuInput==2){
                System.out.println("result "+calc.subtract(m, n));
            }
            else if(menuInput==3){
                System.out.println("result "+calc.multiply(m, n));
            }
            else if(menuInput==4){
                System.out.println("result "+calc.divide(m, n));
            }
        }
        else{
            System.out.println("invalid input");
        }
    }
}
    

