
import java.text.DecimalFormat;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
 public class Rectangle extends GeometricObject{
    private double side1;
    private double side2;
	
	public Rectangle() {
		side1=1.0;
		side2=1.0;
		
	}

        public Rectangle(double side1, double side2,String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
	}




	public double getSide1() {
		return side1;
	}




	public void setLside1(double side1) {
		this.side1 = side1;
	}




	public double getSide2() {
		return side2;
	}




	public void setSide2(double side2) {
		this.side2 = side2;
	}


    @Override
	public double getPerimeter(){
	    return 2*(side1+side2) ;

	}
	
    @Override
	public double getArea() {
	   
	    return (side1*side2);

	}


    @Override
	public String toString() {
		return "Rectangle [side1=" + side1 + ", side2=" + side2 + "]";
	}
        public void   displayObject(GeometricObject obj) {
		
       DecimalFormat dc=new DecimalFormat(".00");
 	System.out.println("\n"+obj.toString()+"\nArea= "+dc.format(obj.getArea())+"\nPerimeter= "+obj.getPerimeter()+"\nColor= "+obj.getColor()+"\nIs filled? "+obj.isFilled());


 }}