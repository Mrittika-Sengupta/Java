/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvalidNameException;

import java.util.Scanner;

/**
 *
 * @author Mrittika
 */
public class Patient {
        private int age;
        private String name;
        private String disease;
          

  
          
    public void setName( String name) throws InvalidNameException{
           
	int len = name.length();
	if(len <= 3){
	
        
       throw new InvalidNameException(name +"..... This a a Invalid name because name doesn't contain less than three letter");
        } else {
            System.out.println(name +" ....This is a Valid name ");
        }
      this.  name = name;
    }
public void setAge( int age) throws InvalidNameException{
           
	
	if(age< 0){
	
        
       throw new InvalidNameException(age + ".... Invalid Age because Age can't be a negative");
        } else{
            System.out.println(age +" ....this is a valid age");
        }
      this.age = age;
    }
    


public static void main(String[] args) throws InvalidNameException{
 
/*
 Patient obj=new Patient();
   try{
    obj.setAge(2);
    obj.setName("Hemsworth");
       }    catch(Exception e){
            System.out.println(e.getMessage());
    
       
           }
        }
      
} */
/*
Patient obj=new Patient();
   try{
    obj.setAge(-2);
    
       }    catch(Exception e){
            System.out.println(e.getMessage());
    
       
           }
        }
      
} */Patient obj=new Patient();
   try{
    obj.setName("Zo");
    
       }    catch(Exception e){
            System.out.println(e.getMessage());
    
       
           }
        }
      
}
