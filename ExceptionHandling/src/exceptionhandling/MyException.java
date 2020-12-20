/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author Mrittika
 */
public class MyException extends
Exception{
    double radius;
public MyException(){
super();
}
public MyException(String message){
super(message);
}


public void setRadius(double radius)
throws MyException{
if(radius<0){
throw new MyException("Invalid"+
"radius");
}
this.radius = radius;
}
public static void main(String[] args) throws MyException{
 MyException c = new MyException();
try{
c.setRadius(-5);
}
catch(MyException e){
System.out.println(e.getMessage());
        }
}}


