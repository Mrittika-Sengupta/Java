/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class ClothingItem extends Product {
private String fabricType;
/**
* @param name
* @param price
* @param fabricType
*/
public ClothingItem(String name, double price, String fabricType) {
super( name, price);
this.fabricType = fabricType;
}

    ClothingItem(String reliance, int i, String rayon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public String getFabricType() {
return fabricType;
}
public void setFabricType(String fabricType) {
this.fabricType = fabricType;
}
public void changePrice(double percentage) {
setPrice(getPrice()-(percentage/100)*getPrice());
}
@Override
public String toString() {
return "ClothingItem :: "+super.toString()+", Fabric Type: " + fabricType;
}

}
