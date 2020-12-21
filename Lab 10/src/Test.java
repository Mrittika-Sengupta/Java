
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

    public class Test {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

        public static void main(String[] args) 
    {
		Rectangle obj=new Rectangle();
                Scanner input=new Scanner(System.in);
		
		System.out.println("Enter three sides of the Triangle");
		System.out.println("Side1:\n");
	        double side1 = input.nextDouble();
	        System.out.println("Side2:\n");
	        double side2 = input.nextDouble();
	        System.out.println("Side3:\n");
	        double side3 = input.nextDouble();

	        System.out.println("Enter the color of  Triangle:");
	        String color = input.next();

	        System.out.println("Is the Triangle filled? Reply with 'true' or 'false' ");
                boolean filled = input.nextBoolean(); 
		
			
		
		System.out.println("Enter Side1 and Side2 of Rectangle");
		System.out.println("Side1:\n");
	        double len = input.nextDouble();
	        System.out.println("Side2:\n");
	        double wid = input.nextDouble();
	       

	        System.out.println("Enter the color of the Rectangle:");
	        String color2 = input.next();

	        System.out.println("Is the Rectangle filled? Reply with 'true' or 'false' ");
                boolean filled2 = input.nextBoolean(); 
	      
	        
	        GeometricObject objTri=new  Triangle(side1,side2,side3,color,filled);
	        GeometricObject objRect=new Rectangle(side1,side2,color2,filled2);
	        System.out.println("\nResult34"
                        + " of Triangle and Rectangle:\n");
	        obj.displayObject(objTri);
	        obj.displayObject(objRect);
    }}