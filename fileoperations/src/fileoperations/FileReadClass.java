/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Mrittika
 */
public class FileReadClass {
    public static void main(String[] args) {
         String filename = "test.txt";
         Scanner input = null;
         System.out.println("the file contains the follwoing strings");
         
         try{
             input = new Scanner(new File(filename));
         }catch(FileNotFoundException e){
             System.out.println("file not found!");
         }
         while(input.hasNextLine()){
             String line = input.nextLine();
             System.out.println(line);
         }
         input.close();
     }
}

