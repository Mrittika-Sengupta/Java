/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork.of.lab.pkg5.pkg6;
import java.util.Scanner;
/**
 *
 * @author Mrittika
 */
public class ClassworkOfLab56 {

    /**
     * @param args the command line arguments
     */
  
        // TODO code application logic here
        public static void arrayExample(int n){
        int[] arr = new int[n];
        Scanner inp = new Scanner(System.in);
        System.out.println("give some integer inputs for array size " + n);
        for(int i=0; i<n; i++){
            arr[i] = inp.nextInt();
        }
        System.out.println("you have given these input ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void arrayExample(int m, int n){
        int[][] arr = new int[m][n];
        Scanner inp = new Scanner(System.in);
        System.out.println("give some integer inputs for array size "+m +" " + n);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = inp.nextInt();
            }
        }
        System.out.println("you have given these input ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void arrayExample(int m, int n, int o){
        int[][][] arr = new int[m][n][o];
        Scanner inp = new Scanner(System.in);
        System.out.println("give some integer inputs for array size "+m +" " + n+" " + o);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                for(int k=0;k<o;k++){
                    System.out.println("give input for "+i+" "+j+" "+k);
                    arr[i][j][k] = inp.nextInt();
                }
            }
        }
        System.out.println("you have given these input ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                for(int k=0;k<o;k++){
                    System.out.print(arr[i][j][k]);
                }
                System.out.println("");
            }
            System.out.println(i+"th channel");
        }
    }
    
    public static String[][] stringArrayExample(int m, int n){
        String[][] arr = new String[m][n];
        Scanner inp = new Scanner(System.in);
        System.out.println("give some integer inputs for array size "+m +" " + n);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = inp.nextLine();
            }
        }
        System.out.println("you have given these input ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        
        return arr;
    }
    
    public static double doubleExample(double m, double n){
        if(n!=0){
            return m/n;
        }
        else{
            return m;
        }
    }
    
    
    
    public static void main(String[] args) {
        
        
        //arrayExample(3,3);
//        String str[][] = stringArrayExample(2,2);
//        System.out.println("here the method returns");
//        for(int i=0; i<2; i++){
//            for(int j=0; j<2; j++){
//                System.out.print(str[i][j]+" ");
//            }
//            System.out.println("");
//        }
        
        System.out.println(doubleExample(24,0));
        
               
        
    }
    }
    

