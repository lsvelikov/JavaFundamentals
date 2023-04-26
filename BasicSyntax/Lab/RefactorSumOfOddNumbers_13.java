package Fundamentals.BasicSyntax.Lab;

import java.util.Scanner;

public class RefactorSumOfOddNumbers_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = 2 * i + 1;
            System.out.println(number);
            sum += number;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
