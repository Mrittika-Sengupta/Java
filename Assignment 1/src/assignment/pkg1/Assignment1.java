/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;
import java.util.Scanner;
/**
 *
 * @author Mrittika
 */
public class Assignment1 {

    
     
        // TODO code application logic here
        public static double grade_point(double a)
    {
        if (a >= 93)
        {
            return 4.0;
        }
        else if (a >= 90)
        {
            return 3.7;
        }
        else if (a >= 87)
        {
            return 3.3;
        }
        else if (a >= 83)
        {
            return 3.0;
        }
        else if (a >= 80)
        {
            return 2.7;
        }
        else if (a >= 77)
        {
            return 2.3;
        }
        else if (a >= 73)
        {
            return 2.0;
        }
        else if (a >= 70)
        {
            return 1.7;
        }
        else if (a >= 67)
        {
            return 1.3;
        }
        else if (a >= 60)
        {
            return 1.0;
        }
        else
        {
            return 0.0;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of Courses:");

        int n=sc.nextInt();

        double[] ar1 = new double[n];
        double[] ar2 = new double[n];
        double[] ar3 = new double[n];
        System.out.print("Enter the final marks beside their credit ");
        System.out.print("\n");

        for (int i = 0;i < n;i++)

        {   ar1[i]= sc.nextDouble(); //take multiple input(marks and credit hours)in one line
            ar2[i]= sc.nextDouble(); //take multiple input(marks and credit hours)in one line
            ar3[i] = grade_point(ar1[i]);
        }
        double total_credit = 0.0;
        for (int i = 0;i < n;i++)
        {
            total_credit += ar2[i]; //summation of credit hours
        }
        double total = 0.0;
        for (int i = 0;i < n;i++)
        {
            total += (ar3[i] * ar2[i]); //multipication grade point and credit hours
        }
        double cpga = total / total_credit; //divided by previous multipication by total credit hours
        System.out.print(" CGPA : ");
        System.out.print(cpga);
        System.out.print("\n");

    }


}
    
    

