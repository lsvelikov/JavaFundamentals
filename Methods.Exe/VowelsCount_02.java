package Fundamentals.Methods.Exe;

import java.util.Scanner;

public class VowelsCount_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printVowelsCount(input.toLowerCase());

    }
    public static void printVowelsCount(String text){

        int count = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
