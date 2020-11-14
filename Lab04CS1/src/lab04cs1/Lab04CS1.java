/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04cs1;
 import java. util. Scanner;
/**
 *
 * @author Mrittika
 */
public class Lab04CS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        for(int i=0;i<st.length();i++ ){
            System.out.println(st.charAt(i));
            for(int j=-1;j<i;j++){
                System.out.print(" ");
            }
        }}}