/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class Triangle {
 private double base; // taking input
    private double height;

    public Triangle(double base, double height) { //passing constructor
        this.base = base;
        this.height = height;
    }
// getter setter method to return Base, height,
    public double getBase() { 
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
// calculate and return triangle Perimeter, triangle  area;
    public double triPerimeter(Triangle tri) {
        return tri.base + (2 * tri.height);
    }

    public double triArea(Triangle tri) {
        return  (tri.base * tri.height)/2;
    }
// for drawing Triangle
    public void drawTriangle() {
        int i, j, row = 6; //taking input
        
        for (i = 0; i < row; i++) {      
            for (j = row - i; j > 1; j--) { //inner loop to handle number spaces 
                System.out.print(" ");//// printing spaces 
            }

            for (j = 0; j <= i; j++) { //inner loop to handle number of columns 
                System.out.print("* "); // printing stars 
            }
            System.out.println(); // ending line after each row 
        }
    }

}   

