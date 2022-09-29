package Fundamentals.DataTypes.Exe;

import java.util.Scanner;

public class WaterOverflow_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int tankCapacity = 255;
        int waterAmount = 0;
        for (int i = 1; i <= n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            waterAmount += liters;
            if (waterAmount > tankCapacity){
                System.out.println("Insufficient capacity!");
                waterAmount -= liters;
                continue;
            }
        }
        System.out.println(waterAmount);
    }
}
