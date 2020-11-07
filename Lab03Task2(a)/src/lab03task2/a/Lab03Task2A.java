package lab03task2.a;
import java.util.Scanner;

public class Lab03Task2A {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         {
    Scanner input = new Scanner(System.in); 
    System.out.println("Enter number of n: ");
    int n = input.nextInt();
      for(int i = n; i >= 1; i--) {
	for(int j = i; j <= n - 1; j++) {
	System.out.print(" ");
	}

			
	for(int j = i; j >= 1; j--) {
	System.out.print(j);
	}

	System.out.println();
          }
        }
      }
    }
