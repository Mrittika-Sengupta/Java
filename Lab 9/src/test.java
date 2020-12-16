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
    public class test {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

        public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of the Triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter the color of Triangle");
        String color = input.next();

        System.out.println(" Is the Triangle filled? Reply with 'True' or 'False' ");

        String filled = input.next(); 
        Triangle triangle = new Triangle(side1, side2, side3);
       

        System.out.println("The Triangle Sides are \n side 1: " + triangle.getSide1() + "\n Side 2: " + triangle.getSide2() + "\n Side 3: " + triangle.getSide3());
        
        System.out.println("The Triangle's Area is " + triangle.getArea());
        
        System.out.println("The Triangle's Perimeter is "+ triangle.getPerimeter());
        
        System.out.println("The Triangle's Color is " + triangle.getColor());
        
        System.out.println("Is the Triangle filled? " + triangle.isFilled());

    }
}
