package Fundamentals.BasicSyntax.MoreExe;

import java.util.Scanner;

public class SortNumbers_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number1 = Double.parseDouble(scanner.nextLine());
        double number2 = Double.parseDouble(scanner.nextLine());
        double number3 = Double.parseDouble(scanner.nextLine());

        double biggestNumber = 0;
        double middleNumber = 0;
        double smallestNumber = 0;
        if (number1 > number2 && number1 > number3) {
            biggestNumber = number1;
            if (number2 > number3) {
                middleNumber = number2;
                smallestNumber = number3;
            } else {
                middleNumber = number3;
                smallestNumber = number2;
            }
        } else if (number2 > number1 && number2 > number3) {
            biggestNumber = number2;
            if (number1 > number3) {
                middleNumber = number1;
                smallestNumber = number3;
            } else {
                middleNumber = number3;
                smallestNumber = number1;
            }
        } else {
            biggestNumber = number3;
            if (number1 > number2) {
                middleNumber = number1;
                smallestNumber = number2;
            } else {
                middleNumber = number2;
                smallestNumber = number1;
            }
        }
        System.out.printf("%.0f%n", biggestNumber);
        System.out.printf("%.0f%n", middleNumber);
        System.out.printf("%.0f%n", smallestNumber);
    }
}
