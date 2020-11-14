/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04cs5;

import java.util.Scanner;

/**
 *
 * @author Mrittika
 */
public class Lab04CS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner(System.in);
           System.out.println("Enter the first string");
           String st1 = input.nextLine();
           int currVow=0, prevVow=0;
             for(int i=0;i<st1.length();i++ ){
            char ch =st1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                prevVow = currVow;
                currVow=i;
            }
             }
             System.out.println("Second last occurance of vowel is at " + prevVow +" the vowel is "+st1.charAt(prevVow));
            }
    }
       
    

