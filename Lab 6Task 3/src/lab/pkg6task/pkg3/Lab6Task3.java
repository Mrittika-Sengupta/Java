/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6task.pkg3;

/**
 *
 * @author Mrittika
 */
public class Lab6Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int rows, cols, sumrow, sumcol,sumP=0, sumS=0;  
          
        //Initialize matrix a  
        int a[][] = {     
                        {3, 4, 9},  
                        {9, 11,0 },  
                        {4, 6, 0} , 
                    };  
            
                           
         rows = a.length;  //Calculate number of rows and columns
        cols = a[0].length;  
         // sum of each row  
        for(int i = 0; i < rows; i++){  
            sumrow=0;
             for(int j = 0; j < cols; j++){  
              sumrow += a[i][j];  
            }  
            System.out.println("Sum of " + (i+1) +" row: " + sumrow);  
        }  
          //sum of each column 
        for(int i = 0; i < cols; i++){    
        sumcol=0;
           for(int j = 0; j < rows; j++){  
              sumcol+= a[j][i];  
            }  
            System.out.println("Sum of " + (i+1) +" column: " + sumcol);  
        }   
     //sum of Primary diagonal
           for (int i = 0, j =0; i< rows && j < cols; i++, j++) {
                  sumP+= a[i][j];
                 }
          //sum of Secondary diagonal
        for (int i=0,j=cols-1 ; i<rows && j>=0 ; i++, j--) {
                  sumS+= a[i][j];
                  }
           System.out.println("sum of Primary elements="+sumP+", sum of secondary elements ="+ sumS );
    }  
}  
    
