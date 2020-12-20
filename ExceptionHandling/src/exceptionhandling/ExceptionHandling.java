/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


//public class ExceptionHandling {

    
   /*  Scanner inp = new Scanner(System.in);
       int age=inp.nextInt();
       public void checkAge(){
           this.age= age;
           if(age<18){
               throw new ArithmeticException();
           }
           else{
               System.out.println("You are eligible to vote");
           }
               
       }
    */  /* public void msg1() throws IOException{
        throw new  IOException("input file corrupted");
    }   
        public void msg2() throws IOException{
            msg1();
        }
        
    void call(){
        try{
            msg2();
            
        } catch(Exception e){
            
            System.out.println(e.getMessage()+"IO exception caought");
        } finally{
            System.out.println("You have tested the throw vs throws funcs");
        }
        }
    
       public static void main(String[] args) {
       */    
        // TODO code application logic here
    //    Scanner inp = new Scanner(System.in);
    /*    try{
           int a= inp.nextInt();
           int b= inp.nextInt();
           int div= a/b;
           System.out.println(div);
           
        } catch(Exception e){
            System.out.println("The denom is zero");
        }
        
    }
   */ /*
    
   ExceptionHandling obj=new ExceptionHandling();
    /*try{
    obj.checkAge();
    
       }    catch(Exception e){
            System.out.println(e+"The minimum voting age is 18");
    
    } 
       }}
          obj.call();
       }}/*
    
    */
  //  public static void main(String[] args) {
          
        // TODO code application logic here
    /*   Scanner inp = new Scanner(System.in);
       try{
int[ ] array = new int[5];
array[7] = 20;
}
catch(ArrayIndexOutOfBoundsException e){
System.err.println("Out of range");

    
        */
   /* Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
double b = input.nextDouble();

try{
if(b==0){
throw new ArithmeticException();
}
System.out.println(a/b);
}
catch(ArithmeticException e){
System.out.println("Invalid value of"
+
"b");
}
    }}
            
*/
/*public static void printLength(String s)
throws NullPointerException{
if(s==null){
throw new NullPointerException("Null"
+
"string");
}
System.out.println(s.length());
}
public static void main(String[] args) {
try{
String str = null;
printLength(str);
}
catch(NullPointerException e){
System.out.println(e.getMessage());
}}}*/