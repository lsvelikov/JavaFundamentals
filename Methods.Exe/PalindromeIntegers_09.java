package Fundamentals.Methods.Exe;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String number = input;

            if (isPalindrome(number)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String number) {

        String reverse = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reverse += number.charAt(i);
        }
        return number.equals(reverse);
    }
}
