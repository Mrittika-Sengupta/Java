/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class Triangle extends GeometricObject 
     {
         private double side1 = 1.0;
         private double side2 = 1.0;
         private double side3 = 1.0;
         
          public Triangle(){
              }
         
          public Triangle(double side1, double side2, double side3) {
             this.side1 = side1;
             this.side2 = side2;
             this.side3 = side3;
             }
         
          public double getSide1() {
             return side1;
         }
          public double getSide2() {
             return side2;
         }
          public double getSide3(){
             return side3;
         }
     
         public void setSide1(double side1) {
             this.side1 = side1;
         }
     
         public void setSide2(double side2) {
             this.side2 = side2;
         }
     
         public void setSide3(double side3){
             this.side3 = side2;
         }
     
         public double getArea(){
             double area,s;
             s = (side1+side2+side3)/2;
             area = Math.sqrt(s * (s- side1) * (s - side2) * (s - side3));
             return area;
         }
     
         public double getPerimeter() {
             return side1 + side2 + side3;
         }
        public String toString(){
         return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2  + " Side 3 = " + side3;
         }
         
          }
