/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04cs3;

import java.util.Scanner;

/**
 *
 * @author Mrittika
 */
public class Lab04CS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner inp=new Scanner(System.in);
        System.out.println("Enter length of one side for the hexagon:");
        double s =inp.nextDouble();
        double hexagonArea = ((6*Math.pow(s,2))/(4*Math.tan(Math.PI/6)));
        System.out.println(String.format("%.2f",hexagonArea));
        
    }
}
    

