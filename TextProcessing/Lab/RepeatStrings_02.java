package Fundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class RepeatStrings_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringArray = input.split("\\s+");

        StringBuilder concatenatedString = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            String currentString = stringArray[i];
            int length = currentString.length();

            for (int j = 0; j < length; j++) {
                concatenatedString.append(currentString);
            }
        }
        System.out.print(concatenatedString);
    }
}
