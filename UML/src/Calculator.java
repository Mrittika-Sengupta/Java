/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class Calculator {
    public double add(double a, double b){
        return a+b; // summation return
    }
    public double subtract(double a, double b){
        return a-b; //subtration return
    }
    public double multiply(double a, double b){
        return a*b; // multipication return
    }
    public double divide(double a, double b){
        if(b!=0){
            return a/b; //division return
        }
        else{
            System.out.println("division by zero");
            return -1.0; // return appropiate message for division error
        }
    }
}


