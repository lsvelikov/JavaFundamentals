package Fundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class ReverseStrings_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")){
            StringBuilder reversedWord = new StringBuilder();

            for (int symbol = input.length() - 1; symbol >= 0; symbol--) {
                char currentSymbol = input.charAt(symbol);
                reversedWord.append(currentSymbol);
            }
            System.out.printf("%s = %s%n", input, reversedWord);
            input = scanner.nextLine();
        }
    }
}
