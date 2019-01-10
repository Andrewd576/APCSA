package Chapter03;

import java.util.Scanner;

/**
 * Prints whether or not a number is a palindrome
 *
 * @author AndrewDolan
 */
public class C3_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int position1 = number / 100;
        int position3 = number % 10;

        System.out.println(number + (position1 == position3 ? " is " : " is not ") + "a palindrome");
    }
}
