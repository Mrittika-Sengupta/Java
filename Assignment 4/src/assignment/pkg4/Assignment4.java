/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;
import java.util.Scanner;

/**
 *
 * @author Mrittika
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
       // create scanner to get input from user
               Scanner scan = new Scanner(System.in);

               System.out.println("First Name : "); //user input for first name

               String firstName = scan.next(); //getting user input
               // loop for name containing any numeric value and valid name
               
               while (firstName.matches(".*\\d.*")) { 
                   //printing message for error invalid input
               System.out.println("\nPlease enter a valid First Name !!!");
               firstName = scan.next();
       }

       System.out.println("Last Name : "); // user input for last name
       String lastName = scan.next(); //getting user input
        //loop for valid name
       while ((lastName.matches(".*\\d.*"))) {
           // //printing message for error invalid input
           System.out.println("\nPlease enter a valid Last Name !!!");
           lastName = scan.next();
       }
       
       int age = 0;

       System.out.println("Date of Birth(dd-mm-yyyy) : "); //user input for date of birth
       String dateOfBirth = scan.next();
       String[] dob = dateOfBirth.split("-");// operating date of birth by " - " and for getting separate get date, month and year
       
       int year = 0;
       
       try {
           year = Integer.parseInt(dob[2]);
       } catch (Exception e) {
          
           System.out.println(" "); 
       }
       // for calculating age and cheking age if it less than 18
       age = 2021 - year;
       while (age < 18) {
           
         
           System.out.println("Age should be less than 18.\nPlease enter valid date of birth.");//printing message for invalid input
           dateOfBirth = scan.next();
           dob = dateOfBirth.split("-");//operating date of birth by " - "  and for getting separate get date, month and year
           
           try {
               year = Integer.parseInt(dob[2]);
           } catch (Exception e) {
             
               System.out.println("This is invalid Date of Birth"); //printing message for error and invalid input
       
           }
           
           // for calculating age and cheking age if it less than 18
           age = 2021 - year;
       }
       System.out.println("Number of family members above age 18 : "); //taking user input
       String numFamilyAbove = scan.next(); //getting user input
      
       int num = 0;
       
       try {
           num = Integer.parseInt(numFamilyAbove);
       } catch (Exception e) {
          
           System.out.println("invalid number of family members..\nNumber of family members above age 18 : "); //printing message for error and invalid input
           numFamilyAbove = scan.next();
           num = Integer.parseInt(numFamilyAbove);
       }
       while (num > 15) {
           System.out.println("Number of Family members cannot be greater than 15.\n Please enter a valid number.");
           numFamilyAbove = scan.next();
           num = Integer.parseInt(numFamilyAbove);
       }
       
       System.out.println("Number of family members below age 18 : "); //taking user input for family member
       // getting user input
       String numFamilyBelow = scan.next();
       
       System.out.println("Average Monthly Personal Income : "); //taking user input for average monthly personal income
       // getting user input for average monthly personal income
       String avgMIncome = scan.next();
       
       // check if input contains non-numeric characters and length greater than 6
       while (avgMIncome.matches(".*\\D.*") || avgMIncome.length() > 6) {
           System.out.println("Income cannot be greater than 6 digits or non-numeric.\nPlease enter a valid income. ");
           avgMIncome = scan.next();
       }
       
       
       System.out.println("AverageMonthly Family Income by : "); //taking user input for Average Monthly Family Income
       String avgMFIncome = scan.next(); //getting user input
       // check if input contains non-numeric characters and length greater than 6
       while (avgMFIncome.matches(".*\\D.*") || avgMFIncome.length() > 6) {
           System.out.println("Income cannot be greater than 6 digits or non-numeric.\n Please enter a valid income. ");
           avgMFIncome = scan.next();
       }
      
       System.out.println("Average Monthly family Expanse : "); //taking user input
       
       String familyExpense = scan.next(); //getting user input
       // check if input contains non-numeric characters and length greater than 6
       // loop till correct input is given
       
       double familyIn = Double.valueOf(avgMFIncome); // covert family income to double
       double familyExp = Double.valueOf(familyExpense);
       
       while (familyExpense.matches(".*\\D.*") || familyExpense.length() > 6 || familyExp > 25 * familyIn / 100) {
           System.out.println("Income cannot be greater than 6 digits or non-numeric.\nPlease enter a valid familyexpense. "); 
           familyExpense = scan.next();
           familyExp = Double.valueOf(familyExpense);
       }
       
       System.out.println("Average Monthly Farming Expense : "); //taking user input
       String FarmExpense = scan.next(); //getting user input
       
       double farmingExp = Double.valueOf(FarmExpense); //// convert farming expense to double
       // check if farming expense greater than 25% of family income
       while (farmingExp > 25 * familyIn / 100) {
           System.out.println("Family expense cannot be greater tha 25% of family income.\nPlease enter a valid farming expense.");
           FarmExpense = scan.next();
           farmingExp = Double.valueOf(FarmExpense);
       }
     
       System.out.println("If they need any help from the government : ");
       String help = scan.next();
       // checking if input is boolean value
       while (!(help.equalsIgnoreCase("true") || help.equalsIgnoreCase("false"))) {
           System.out.println("Please enter a valid input(true/false).");
           help = scan.next();
       }
       
       System.out.println("Amount of money they wish to have as stipend from the Govt : ");
       String stipend = scan.next();
       
       // check if it matches non-numeric value and 25% greater than family income,
 
       double amount = Double.valueOf(stipend);
       while (stipend.matches(".*\\D.*") || amount > 25 * familyIn / 100) {
   
           System.out.println("Enter a valid amount.");
           //getting user input
           stipend = scan.next();
           amount = Double.valueOf(stipend);
       }
      
       System.out.println("Fertilizers (in Kg) s/he needs to buy each month : ");
       String FertilizerKg = scan.next();
       
       while (FertilizerKg.matches(".*\\D.*") || FertilizerKg.length() > 2) {
           System.out.println("Enter a valid amount in kg.");
           FertilizerKg = scan.next();
       }
   }
}

    
    

