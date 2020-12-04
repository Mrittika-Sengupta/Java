
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */


public class User {
    private static Scanner scanner = new Scanner(System.in);
     public static void main(String[] args)
    {
        boolean quit = false;
        int n;
        String Name;
        int Account_Num;
        double Balance;
        //taking input from user
        System.out.println("Name: ");
        Name = scanner.nextLine();
        System.out.println("Account Number:");
        Account_Num= scanner.nextInt();
        System.out.println("Balance: ");
        Balance = scanner.nextDouble();
        Admin account = new Admin(Name,Account_Num,Balance);
        //printing properties
        do{
                                System.out.println("1.Withdraw");
				System.out.println("2.deposit");
				System.out.println("3.Balance");
				System.out.println("4.Exit");
				System.out.println("Your Choice :");
				
                                n = scanner.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter amount you want to withdraw:");
                    account.WithDraw(scanner.nextDouble());
                    break;
                    
                case 2:
                    System.out.println("Enter amount you want to deposit:");
                    account.Deposit(scanner.nextDouble());
                    break;
                   
                    
                case 3:
                    System.out.println("Current Balance is:"+account.getBalance());
                            account.getBalance();
                    break;
                    
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            } }
         while(n != 4);
    }
}