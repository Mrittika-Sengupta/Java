/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Mrittika
 */
public class Quiz {

    
    public int id;
    public int marks;
    public Quiz(int id,int marks){
        this.id=id;
        this.marks=marks;
                
    }
    

    public int getId(){

        return id;

    }

   
    public void setId(int id){

        this.id = id;

    }
     public int getMarks(){

        return marks;

    }

   
     public void setMarks(int marks){

        this.marks = marks;

    }
      public static void main(String[] args) {
         String fileName = "Quiz.txt";
         Quiz[] quiz= new Quiz[20];
         int count=0;
         
         try{
             Scanner fileReader = new Scanner(new File(fileName)) {
                 while(fileReader.hasNextInt() && count<quiz.length){
                     
                     int id=fileReader.nextInt();
                     int marks=fileReader.nextInt();
                     quiz[count++]=new Quiz(id,marks);
                                }
                 fileReader.close();
                 
                 }
         catch (FileNotFoundException e){
                 System.out.println("Error!" +fileName);
               return;
                 }
        int highest=0;
        for(int i=0;i<count;i++){
            System.out.println("Id= "+quiz[i].getId()+" Marks= "+quiz[i].getMarks());
            if(quiz[i].getMarks()>quiz[highest].getMarks())
                highest=i;
                        }
        System.out.println("Highest Mark is= " + quiz [highest].getMarks() + "and who got it is Id= "+quiz[highest].getId());
                }
          }