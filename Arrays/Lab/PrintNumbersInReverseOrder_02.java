package Fundamentals.Arrays.Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[]numbersArray = new int[n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            numbersArray[i] = num;
        }
        for (int i = numbersArray.length - 1; i >= 0; i--) {
            System.out.printf("%d ", numbersArray[i]);
        }
    }
}
