package Fundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class Substring_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stringToRemove = scanner.nextLine();
        String inputString = scanner.nextLine();

        int index = inputString.indexOf(stringToRemove);
        while (index != -1){
            inputString = inputString.replace(stringToRemove, "");
            index = inputString.indexOf(stringToRemove);
        }
        System.out.println(inputString);
    }
}
