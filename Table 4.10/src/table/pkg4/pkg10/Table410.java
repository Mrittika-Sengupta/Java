/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.pkg4.pkg10;

/**
 *
 * @author Mrittika
 */
public class Table410 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
          
       System.out.println ("Welcome to Java".indexOf('W'));// returns 0

System.out.println("Welcome to Java".indexOf('m', 6) );//returns -1
System.out.println("Welcome to Java".indexOf("come"));// returns 3
System.out.println("Welcome to Java".indexOf("Java", 5));// returns 11
System.out.println("Welcome to Java".indexOf("java", 5));// returns -1
System.out.println("Welcome to Java".lastIndexOf('t') );//returns 8

System.out.println("Welcome to Java".lastIndexOf('o', 5) );//returns 4
System.out.println("Welcome to Java".lastIndexOf("to") );//returns 8
System.out.println("Welcome to Java".lastIndexOf("Java", 5) );//returns -1

    }
    
}
