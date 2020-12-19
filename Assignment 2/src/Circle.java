/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class Circle {
    private double radius; //taking input

    public Circle(double radius) { // passing constructor
        this.radius = radius;
    }
 // getter setter method for returning radius,area etc
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circCircumference(Circle circle) {
        return 2 * Math.PI * circle.radius;
    }

    public double cirArea(Circle circle) {
        return Math.PI * (circle.radius * circle.radius);
    }
     //for drawing circle
    public void drawCircle() { 
        double dist;

        // changing radius value to static 
        this.radius = 6; 
        
        // for horizontal movement 
        for (int i = 0; i <= 2 * this.radius; i++) {

            // for vertical movement 
            for (int j = 0; j <= 2 * this.radius; j++) {
                dist = Math.sqrt((i - this.radius) * (i - this.radius)
                        + (j - this.radius) * (j - this.radius));

                // dist should be in the range (radius - 0.5) 
                // and (radius + 0.5) to print stars(*) 
                if (dist > this.radius - 0.5 && dist < this.radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }

            System.out.print("\n"); //new line to move to the next line
        }
    }

}

