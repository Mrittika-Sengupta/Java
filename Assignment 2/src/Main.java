/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
interface Interface{
    //giving value for circle ,rectangle and triangle for printing
    Circle objCirc = new Circle(3.0); 
    Rectangle objRec = new Rectangle(30.0, 20.0); 
    Triangle objTriangle = new Triangle(40.0, 30.0); 
    User objUser = new User();
    
}

public class Main implements Interface {
    
    public static void main(String args[]){
        
        // call Interface variables and use them, such as objCirc, objRec, etc. 
        //print area, perimeter, circumference to the Circle, Rectangle and Triangle 
        // print pattern
        
        System.out.println("Starting program...");
        
        System.out.println("Circle Area = " + objCirc.cirArea(objCirc));
        System.out.println("Circle Circumference =" +objCirc.circCircumference(objCirc));
        
        System.out.println("Triangle Area=" + objTriangle.triArea(objTriangle));
        System.out.println("Triangle Perimeter=" +objTriangle.triPerimeter(objTriangle));
         
        System.out.println("Rectangle Area=" +objRec.recArea(objRec));
        System.out.println("Rectangle Perimeter=" +objRec.recPerimeter(objRec));
        
        objCirc.drawCircle();
        objRec.drawRectangle();
        objTriangle.drawTriangle();
        System.out.println("Exiting program..."); 
        
    }
    
}