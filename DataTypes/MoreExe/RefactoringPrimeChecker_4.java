package Fundamentals.DataTypes.MoreExe;

import java.util.Scanner;

public class RefactoringPrimeChecker_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= number; i++) {
            boolean isGiven = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isGiven = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isGiven);
        }
    }
}

