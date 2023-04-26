package Fundamentals.DataTypes.Exe;

import java.util.Scanner;

public class Snowballs_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int snowBalls = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;
        for (int i = 1; i <= snowBalls; i++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow(snowBallSnow / snowBallTime,snowBallQuality);

            if (snowballValue > maxValue){
                maxValue = snowballValue;
                maxSnow = snowBallSnow;
                maxTime = snowBallTime;
                maxQuality = snowBallQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, maxValue, maxQuality);
    }
}
