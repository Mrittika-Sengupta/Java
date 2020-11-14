/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04cs2;
 import java. util. Scanner;
/**
 *
 * @author Mrittika
 */
public class Lab04CS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
          String st = inp.nextLine();
          switch(st){
              case "one" :
                  System.out.println("You have entered 1");
                  break;
                   case "two" :
                  System.out.println("You have entered 2");
                  break;
                   case "three" :
                  System.out.println("You have entered 3");
                  break;
                   default :
                        System.out.println("anything else");
          }
    }
    
}
