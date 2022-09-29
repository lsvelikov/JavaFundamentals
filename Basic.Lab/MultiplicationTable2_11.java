package Fundamentals.BasicSyntax.Lab;

import java.util.Scanner;

public class MultiplicationTable2_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int givenNumber = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", number, givenNumber, number * givenNumber);
            givenNumber++;
        } while (givenNumber <= 10);
    }
}
