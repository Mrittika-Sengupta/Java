/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04cs4;

import java.util.Scanner;

/**
 *
 * @author Mrittika
 */
public class LAB04CS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the first string");
        String st1= inp.nextLine();
         System.out.println("Enter the second string");
        String st2= inp.nextLine();
        int n1= st1.length();
         int n2= st2.length();
         if (n1>n2){
             System.out.println("The second string should be smaller in length");
         }if(st1.substring(0, n2). equals(st2)){
        System.out.println("String "+ st1 +"starts with string" +st2);
    } if(st1.substring(n1-n2, n1). equals(st2)){
     System.out.println("String "+ st1 + "ends with string" +st2);
} else{
  System.out.println("String "+ st1 +" has no match with " +st2);
    }
    
    
    }
}
    
    

