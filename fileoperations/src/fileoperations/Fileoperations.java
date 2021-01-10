/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fileoperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String filename = "test.txt";
        PrintWriter output=null;
        try{
            output = new PrintWriter(new FileOutputStream(filename, true));
        }catch(FileNotFoundException e){
            System.out.println("file not found exception caught");
        }
        
        System.out.println("enter few strings");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< 3; i++){
            String ln = sc.nextLine();
            output.println(i+" th input "+ ln);
        }
        output.close();
        System.out.println("lines written successfully");
    }
    
}



        
    
    

