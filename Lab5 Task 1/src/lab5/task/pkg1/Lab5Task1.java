/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.task.pkg1;

import java.util.Scanner;

/**
 *
 * @author Mrittika
 */
public class Lab5Task1 {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st1 = in.nextLine();

        System.out.print("Number of  Vowels: " + countVowels(st1)+"\n");
    }
 public static int countVowels(String st1)
    {
        int count = 0;
        for (int i = 0; i < st1.length(); i++){
       char ch =st1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='0'||ch=='U')
            {
                count++;
            }
        }
        return count;
    }
}
