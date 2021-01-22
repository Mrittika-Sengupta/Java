/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
import java.util.ArrayList;
public class Test {
public static void main(String[] args) {
Product p1=new ElectronicDevice("Mobile",730, "Apple XR", "One year");
ClothingItem p2=new ClothingItem("Reliance", 210, "Rayon");
ElectronicDevice p3=new ElectronicDevice("Laptop", 890, "Lenovo", "Two Years");
p3.changePrice(10);
p2.changePrice(20);
((ElectronicDevice)p1).setWarranty("6 months");
ArrayList<Product> products=new ArrayList<Product>();
products.add(p1);
products.add(p2);
products.add(p3);
for(int i=0;i<products.size();i++)
{
if(products.get(i) instanceof ClothingItem)
{
System.out.println((ClothingItem)(products.get(i)));
}
else if(products.get(i) instanceof ElectronicDevice)
{
System.out.println((ElectronicDevice)(products.get(i)));
}
}
}}

