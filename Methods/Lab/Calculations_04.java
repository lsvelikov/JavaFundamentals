package Fundamentals.Methods.Lab;

import java.util.Scanner;

public class Calculations_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        switch (input){
            case "add":
                addNumbers(number1, number2);
                break;
            case "multiply":
                multiplyNumbers(number1, number2);
                break;
            case "subtract":
                subtractNumbers(number1, number2);
                break;
            case "divide":
                divideNumbers(number1, number2);
                break;
        }
    }
    public static void addNumbers(int n1, int n2){
        int result = n1 + n2;
        System.out.println(result);
    }
    public static void multiplyNumbers(int n1, int n2){
        int result = n1 * n2;
        System.out.println(result);
    }
    public static void subtractNumbers(int n1, int n2){
        int result = n1 - n2;
        System.out.println(result);
    }
    public static void divideNumbers(int n1, int n2){
        int result = n1 / n2;
        System.out.println(result);
    }
}
