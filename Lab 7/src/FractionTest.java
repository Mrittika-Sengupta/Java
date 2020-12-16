
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
public class FractionTest {
     public static void main(String[] args) {
	Fraction obj1 = new Fraction(10, 20);
	System.out.println(obj1.toString());
	Fraction obj2 = new Fraction(4, 20);
	Fraction obj3 = obj1.add(obj2);
	System.out.println("addition of "  + obj1 + " and " + obj2 + " is : " + obj3);
        
	obj3 = obj1.subtract(obj2);
	System.out.println("subtraction of " + obj1 + " and " + obj2 + " is : " + obj3);
        
	obj3 = obj1.divide(obj2);
	System.out.println("Result of division of " + obj1 + " and " + obj2 + " is : " + obj3);
        
	obj3 = obj1.multiply(obj2);
	System.out.println("Result of multiplication of " + obj1 + " and " + obj2 + " is : " + obj3);
    }
}