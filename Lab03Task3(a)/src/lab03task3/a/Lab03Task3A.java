/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03task3.a;

/**
 *
 * @author Mrittika
 */
public class Lab03Task3A {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int  upper=1;
        
       int lower = (int)(1+ Math.random() * (1000 - 1) + 1) ;
            while(lower>999){
        
                lower = (int)(1+ Math.random() * (1000 - 1 )+ 1) ;
            } while(lower>=upper){
                 upper = (int)(1+ Math.random() * (1000 - 1) + 1) ;
            }
      System.out.println("Random number from 1 to 10000 :     lower "+lower +" upper"   +upper+":");
    }
        
    }


