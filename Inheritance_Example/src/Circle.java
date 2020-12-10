/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class Circle extends GeometricObject {
    private double radius;
    public Circle(String color, boolean filled, double radius) {
super(color, filled);
this.radius = radius;
}
    
    public double getArea(){
        return 3.1416*radius*radius;
    }
    public double getParimeter(){
        return 3.1416*radius*radius;
    }

   public String toString(){
return super.toString()+" radius: "+radius;
} 
}

