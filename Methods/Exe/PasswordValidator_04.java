package Fundamentals.Methods.Exe;

import java.util.Scanner;

public class PasswordValidator_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isPasswordLengthValid = passLength(input);
        if (!isPasswordLengthValid){
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isPasswordContentValid = isConsistingLetterAndDigits(input);
        if (!isPasswordContentValid) {
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isPasswordCountDigitsValid = isCountDigitValid(input);
        if (!isPasswordCountDigitsValid){
            System.out.println("Password must have at least 2 digits");
        }
        if (isPasswordLengthValid && isPasswordContentValid && isPasswordCountDigitsValid){
            System.out.println("Password is valid");
        }
    }

    public static boolean passLength(String symbols) {
        return symbols.length() >= 6 && symbols.length() <= 10;
    }

    public static boolean isConsistingLetterAndDigits(String text) {
        for (char symbol : text.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }
    public static boolean isCountDigitValid(String text){
        int countDigit = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol >= 48 && symbol <= 57){
                countDigit++;
            }
        }
        return countDigit >= 2;
    }
}
