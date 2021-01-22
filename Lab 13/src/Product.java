/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */

    
public abstract class Product {
private String name;
private double price;
/**
* @param name
* @param price
*/

public Product(String name, double price) {
this.name = name;
this.price = price;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;
}
public abstract void changePrice(double percentage);
@Override
public String toString() {
return "Name: " + name + ", Price: " + price;
}
}
