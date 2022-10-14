package Fundamentals.Methods.Lab;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1, num2));
                break;
            case "char":
                char sym1 = scanner.nextLine().charAt(0);
                char sym2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(sym1, sym2));
                break;
            case "string":
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(getMax(text1, text2));
                break;
        }

    }
    public static int getMax(int number1, int number2){
        if (number1 > number2){
            return number1;
        }
        return number2;
    }
    public static char getMax(char symbol1, char symbol2){
        if (symbol1 > symbol2){
            return symbol1;
        }
        return symbol2;
    }
    public static String getMax(String word1, String word2){
        if (word1.compareTo(word2) > 0){
            return word1;
        }
        return word2;
    }
}
