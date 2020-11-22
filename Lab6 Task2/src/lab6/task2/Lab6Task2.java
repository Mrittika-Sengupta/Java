/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.task2;
import java.util.Scanner;
/**
 *
 * @author Mrittika
 */
public class Lab6Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number");
          n=sc.nextInt();
          int fib[]=new int [n];
          fib[0]=0;
           fib[1]=1;
           for(int i=2;i<fib.length;i++){
               fib[i]= fib[i-1]+ fib[i-2];
           }
           System.out.println("fibonacci numbers");
           
             for(int i=0;i<fib.length;i++){
                  System.out.println(fib[i]+""); 
             }
    }
}