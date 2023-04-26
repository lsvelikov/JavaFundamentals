package Fundamentals.BasicSyntax.MoreExe;

import java.util.Scanner;

public class ReverseString_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0 ; i--) {
            char currentSymbol = word.charAt(i);
            reverseWord += currentSymbol;
        }
        System.out.printf("%s", reverseWord);
    }
}
