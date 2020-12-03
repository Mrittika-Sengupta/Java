/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class CalculatorTest {
     public static void main(String[] args){
        Menu men = new Menu();// access showmMenu form Menu class using men obj
        int a = men.showMenu(); // this will go to the menu class and select the performance.Then It returns for add, sub,multi or div
        men.handleMenuInput(a);
    }
}

