/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class ElectronicDevice extends Product {
private String model;
private String warranty;
/**
* @param name
* @param price
* @param model
* @param warranty
*/
public ElectronicDevice(String name, double price, String model,String warranty) {
super(name, price, model, warranty);
this.model = model;
this.warranty = warranty;
}

    ElectronicDevice(String mobile, int i, String apple_XR, String one_year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void setModel(String model) {
this.model = model;
}
public String getWarranty() {
return warranty;
}
public void setWarranty(String warranty) {
this.warranty = warranty;
}
public void changePrice(double percentage) {
setPrice(getPrice()+(percentage/100)*(getPrice()));
}
@Override
public String toString() {
return "ElectronicDevice :: "+super.toString()+", Model: " + model + ", Warranty: " + warranty;
}
}
