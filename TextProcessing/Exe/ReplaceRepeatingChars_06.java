package Fundamentals.TextProcessing.Exe;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            char nextSymbol = input.charAt(i + 1);

            if (symbol != nextSymbol){
                newString.append(symbol);
            }
            if (i == input.length() - 2){
                newString.append(nextSymbol);
                break;
            }
        }
        System.out.println(newString);
    }
}
