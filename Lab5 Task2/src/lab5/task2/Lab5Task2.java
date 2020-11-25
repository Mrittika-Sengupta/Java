/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.task2;
import java.util.Scanner;
/**
 *
 * @author Mrittika
 */
public class Lab5Task2 {

public static boolean isPalidrome(String s){ 
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        return isPalidrome(s.substring(1, s.length()-1)); return false;
    }
        public static void main(String[]args){
    
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String");
        String st1 = in.nextLine();
        
        if(isPalidrome(st1))
            System.out.println(st1 + " is  palindrome");
        else
            System.out.println(st1 + " is not  palindrome");
    }
}