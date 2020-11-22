/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.task4;
import java.util.Scanner;

public class Lab6Task4 {

    
 

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int[] numbers = new int[input.nextInt()];

        System.out.print("Enter numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }Consecutive(numbers);
        }

       public static void Consecutive(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            }
            if (count == 3) {
                System.out.print(array[i] + " ");
                i++;
                count = 1;
            }
        }
    }
}