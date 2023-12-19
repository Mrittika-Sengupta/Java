import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Print 'Enter your string' message
        System.out.print("Enter your string: ");

        // Read input string from user
        String inputString = new Scanner(System.in).nextLine();

        // Print ''Reverse String' message
        System.out.println("Reversed String: " + reverseString(inputString));
    }

    // Method for reverse a given string
    private static String reverseString(String input) {
        char[] charArray = input.toCharArray(); // Convert string to char array
        int start = 0, end = charArray.length - 1; // Initialize start and end

        while (start < end) {
        
        // Swap characters at start and end indices using a two-pointer approach
        char temp = charArray[start];
        charArray[start++] = charArray[end];
        charArray[end--] = temp;
        }

        //back to a string
        return new String(charArray); 
    }
}
