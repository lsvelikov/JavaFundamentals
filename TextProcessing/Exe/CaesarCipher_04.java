package Fundamentals.TextProcessing.Exe;

import java.util.Scanner;

public class CaesarCipher_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            char newSymbol = (char) (currentSymbol + 3);
            text.append(newSymbol);
        }
        System.out.println(text);
    }
}
