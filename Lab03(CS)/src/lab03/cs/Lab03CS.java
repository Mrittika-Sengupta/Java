/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.cs;
import java.util.Scanner;
/**
 *
 * @author Mrittika
 */
public class Lab03CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        int i=0, num, sum=0;
        System.out.println("enter an integer");
        Scanner inp = new Scanner(System.in);
        num = inp.nextInt();
        int arr[] = new int[num+1];
        
        for(i=0;i<=num;i++){
            arr[i] = i;
            sum = sum+i;
            if(i==num){
                System.out.print(i+" ");
                break;
            }
            System.out.print(i+" +");
        }
        System.out.println(" = "+sum);
        
        for(int j: arr){
            if(arr[j]==num){
                System.out.print(arr[j]+" ");
                break;
            }
            System.out.print(arr[j]+" + ");
        }
        System.out.println(" = "+sum);
        
        
        
        
        
        
        
        
//        while(i<=num){
//            sum = sum+i;
//            if(i==num){
//                System.out.print(i+" ");
//                break;
//            }
//            System.out.print(i+" +");
//            
//            i++;
//        }
//        do{
//            sum = sum+i;
//            if(i==num){
//                System.out.print(i+" ");
//                break;
//            }
//            System.out.print(i+" +");
//            
//            i++;
//        }while(i<=num);
//        System.out.println(" = "+sum);

//        for(i=0;i<=num;i++){
//            sum = sum+i;
//            if(i==num){
//                System.out.print(i+" ");
//                break;
//            }
//            System.out.print(i+" + ");
//            
//        }
//        System.out.println(" = "+sum);


                
    
    }
    
}
