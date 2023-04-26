package Fundamentals.DataTypes.Exe;

import java.util.Scanner;

public class SpiceMustFlow_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int totalYield = 0;
        int daysCount = 0;
        while (startingYield >= 100) {
            int givenYield = startingYield - 26;
            totalYield += givenYield;
            startingYield -= 10;
            daysCount++;
        }
        System.out.println(daysCount);
        if (totalYield >= 26) {
            totalYield -= 26;
        }
        System.out.println(totalYield);
    }
}
