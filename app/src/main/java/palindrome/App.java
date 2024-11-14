/*
 * Check If the number is palindrome or not.
 */
package palindrome;

import java.util.Scanner;

public class App {
    // Create a function to check if the number is palindrome or not.
    public static boolean isPalindrome(int number) {
        String numString = Integer.toString(number);
        String numStringReversed = "";
        // Reverse the numString variable
        for (int i=numString.length()-1; i>=0; i--) {
            numStringReversed = numStringReversed + numString.charAt(i);
        }

        if(numString.equals(numStringReversed)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int number;

        System.out.println("Enter a number:");
        number = ss.nextInt();
        System.out.println(isPalindrome(number));
    }
}
