package Fundamentals.Methods.Exe;

import java.util.Scanner;

public class FactorialDivision_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long firstFact = calculateFactorial(number1);
        long secondFact = calculateFactorial(number2);

        double result = firstFact * 1.0 / secondFact;
        System.out.printf("%.2f", result);
    }
    public static long calculateFactorial(int number){
        long sumFact = 1;
        for (int i = 1; i <= number; i++) {
            sumFact *= i;
        }
        return sumFact;
    }
}
