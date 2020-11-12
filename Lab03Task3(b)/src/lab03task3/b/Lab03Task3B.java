
package lab03task3.b;


public class Lab03Task3B {

    public static void main(String[] args) {
        // TODO code application logic here
          int  upper=1;
        
       int lower = (int)(1+ Math.random() * (1000 - 1) + 1) ;
            while(lower>999){
        
                lower = (int)(1+ Math.random() * (1000 - 1 )+ 1) ;
            } while(lower>=upper){
                 upper = (int)(1+ Math.random() * (1000 - 1) + 1) ;
            }
      System.out.println("Random number from 1 to 10000 and divisible by 5& 8:     lower "+lower +" upper"   +upper+":");{
        int i = upper;
     while( i >= lower) {
  if(i % 5 == 0 && i % 8 == 0) {
    System.out.println(i);
  }i--;}
  
     }
  
	
        }
    } 

        	
                
  

                      
    
    

