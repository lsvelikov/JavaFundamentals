package Fundamentals.Methods.Lab;

import java.util.Scanner;

public class RepeatString_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(input, n));
    }
    public static String repeatString(String word, int number){
        String newWord = "";
        for (int i = 0; i < number; i++) {
            newWord += word;
        }
        return newWord;
    }
}
