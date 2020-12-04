/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class Admin {
    //initialoze properties
        public String Name;
        private int Account_num;
        private double Balance;

public Admin(String Name, int Account_num, double Balance){ //passing paramter
        if(Balance < 0)
        {
            System.out.println(" Invalid Input"); // balance cannot be less than 0
        }
        else {
            this.Name = Name;
            this.Account_num=Account_num;
            this.Balance = Balance;
            System.out.println("Your current balance is:" + this.Balance); //printing current blanace
        }
    }
    public String getName(){ 
       return Name;
    }
    public int getAccount_Num(){
       return Account_num;
    }
     public double getBalance() {
       return Balance;
    }

    

    public void Deposit(double deposit){ //checking for deposit amount
        if(deposit < 0){
            System.out.println(" Invalid Input");
        }else {
            this.Balance += deposit;
            System.out.println("You successfully deposit the balance.Current  balance is:"+this.Balance);
        }
    }
    public void WithDraw(double withdraw) //checking for withdraw amount
    {
        if(withdraw > this.Balance)
        {
            System.out.println(" You don't have sufficient balance");
        }else if(withdraw < 0)
        {
            System.out.println(" In valid input");
        }else
        {
            this.Balance -= withdraw;
            System.out.println("You successfully withdraw the balance. Current balance is:"+this.Balance);
        }
    }

   }
