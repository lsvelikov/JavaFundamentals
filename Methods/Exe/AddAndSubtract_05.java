package Fundamentals.Methods.Exe;

import java.util.Scanner;

public class AddAndSubtract_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int result = sum(number1, number2);
        System.out.println(subtract(result, number3));

    }
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }
}
