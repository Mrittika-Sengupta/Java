/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class Main_Class {
    public static void main(String args[]){
        Circle circ = new Circle("Black" , false,5.25);
        System.out.println(circ.getArea());
        System.out.println(circ.toString());
        circ.setColor("Blue");
        System.out.println(circ.getColor());
        GeometricObject geo=new GeometricObject();
        System.out.println(geo.toString());
    }
}
