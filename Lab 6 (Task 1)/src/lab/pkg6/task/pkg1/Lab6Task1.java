/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6.task.pkg1;
import java.util.Scanner;
/**
 *
 * @author Mrittika
 */
public class Lab6Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int sum=0,percentage= 0;
       double avg = 0;
    Scanner input = new Scanner(System.in);
    int[]arr=new int [6];

    System.out.println("Enter numbers: ");

    for(int i=0; i<6; i++){
        arr[i]=input.nextInt();
        sum+=arr[i];
        avg=sum/6;
    }
    System.out.println("Average is: "+avg);
    int count = 0;
    for(int i=0;i<arr.length;i++){
         if(arr[i]>avg){
          count=count+1;
        }
    }
    
    percentage = (count*100)/6;
    System.out.println("Percentage: "+percentage+"%");

 }
    }