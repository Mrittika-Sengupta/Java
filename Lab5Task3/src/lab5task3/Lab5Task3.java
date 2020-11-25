/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5task3;

import java.util.Scanner;
/**
 *
 * @author Mrittika
 */
public class Lab5Task3 {

    /**
     * @param args the command line arguments
     */
  
      static double balance=0; 
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			int n ;
			do {
			      
				System.out.println("1.Deposit");
				System.out.println("2.Withdraw");
				System.out.println("3.Balance");
				System.out.println("4.Exit");
				System.out.println("Your Choice :");
                                
				n = input.nextInt();
				

                            switch (n) {
                                case 1:
                                    System.out.println("Enter the amount: ");
                                    int a = input.nextInt();
                                    deposit(a);
                                    System.out.println("You successfully Deposit: " + a +"$");
                                    break;
                                case 2:
                                     System.out.println("Enter the amount: ");
                                    int b = input.nextInt();
                                    withdraw(b);
                                     System.out.println(" ");
                                    break;
                                case 3:
                                    System.out.println("Your current Balance is: "+balance +" ");
                                    break;
                                default:
                                    break;
                            }

			}  
                        
                        while(n != 4 );


		}
		public static double deposit(double amount) {
			balance=balance+amount;
                        
			return balance;
		} 
		public static double withdraw(double amount) {
	
                               if(amount<=balance)
        {
            balance = balance-amount;
            System.out.println("You successfully Withdraw:");
        }
                               else{
        
            System.out.println("Your account has insufficient balance.You can't withdraw");
        }
                         return balance;
                         
                }
                    public static void prn(Object anyObject) {
			System.out.println(anyObject);
		}

	}