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
        int lower=1,upper=1000;
        System.out.println("two Random numbers from "+lower+" to "+upper+":");
        for(int i =1;i<=2;i++){
        int randomNumber = (int)(lower+ Math.random() * (upper - lower + 1) );
      System.out.println(randomNumber);
    }
        
    }
}

