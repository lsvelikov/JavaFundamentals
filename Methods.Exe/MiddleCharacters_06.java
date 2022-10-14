package Fundamentals.Methods.Exe;

import java.util.Scanner;

public class MiddleCharacters_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }
    public static void printMiddleCharacter(String text){
        int length = text.length();
        char[] charsArr = text.toCharArray();
        if (length % 2 != 0){
            char middleSymbol = charsArr[charsArr.length / 2];
            System.out.println(middleSymbol);
        }else{
            char middleSymbol = charsArr[charsArr.length / 2 - 1];
            char secondMiddleSymbol = charsArr[charsArr.length / 2];

            System.out.printf("%c%c", middleSymbol, secondMiddleSymbol);
        }
    }
}
