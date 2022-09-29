package Fundamentals.DataTypes.Exe;

import java.util.Scanner;

public class BeerKegs_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int beerKegs = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String biggestModel = "";
        for (int i = 1; i <= beerKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * kegHeight;

            if (volume > maxVolume){
                maxVolume = volume;
                biggestModel = model;
            }
        }
        System.out.printf("%s", biggestModel);
    }
}
