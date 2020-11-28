/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module1;

/**
 *
 * @author Mrittika
 */
//public class Info2 {
   // public static void main(String args[]){
       // Info1 obj1= new Info1(15,30);
       // obj1.add(obj1);
       //  Info1 obj2= new Info1(5,30);
       // obj2.add(obj2);
   // }
    
//} 
     //  Info1 obj1= new Info1(15,30);
      //  obj1.add(obj1);
       //  Info1 obj2= new Info1(5,30);
     
    // System.out.println(obj1);
    //} }
/*
        Info1 obj1= new Info1(15,30);
        obj1.add(obj1);
       Info1 obj2= new Info1(5,30);
     
    System.out.println(obj1);
    } }
   */ 

      /*  Info1 obj1 = new Info1(15, "CSE215;");
        obj1.printValue();
    }
    
}
*/ 
    
     public class Info2 {
    
    public static void main(String args[]){
        Info1 obj1= new Info1(15,30);
        obj1.add(obj1);
         Info1 obj2= new Info1(5,30);
         obj2.displayRaw();
         obj2.add(obj1);
    }
}