/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class GeometricObject {
    
    private String color = "red";
	private boolean filled;
	
	public GeometricObject() {
		
	}

	public GeometricObject(String color, boolean filled) {
        
        this.color = color;
        this.filled = filled;   
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public double getPerimeter()
	{
		System.out.println("Unknown Object");
	    return 0 ;

	}
	
	public double getArea() 
	{
	   System.out.println("Unknown Object");
	    return 0;

	}}