/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class Rectangle {
   private double length; // taking input
    private double width;

    public Rectangle(double length, double width) { // passing constructor
        this.length = length;
        this.width = width;
    }
     //getter setter method for returning length ,width etc
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double recPerimeter(Rectangle rec) { // calculate perimeter and return
        return 2 * (rec.length + rec.width);
    }

    public double recArea(Rectangle rec) { //calculate area and return
        return rec.length * rec.width;
    }
       // for drawing Rectangle
    public void drawRectangle() {
        int i, j, rows, columns; //taking input
        
        // static values as no args passed 
        rows = 5;
        columns = 3;
        
        for (i = 1; i <= rows; i++) { //Run a loop ‘row’ number of times to iterate through all the rows
            for (j = 1; j <= columns; j++) { //Run a nested loop ‘col’ times to iterate though each column of a row
                System.out.print("* "); //printing stars
            }
            System.out.print("\n"); //new line to move to the next line
        }
    }

   
    }
 

