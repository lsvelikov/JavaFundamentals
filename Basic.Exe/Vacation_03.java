package Fundamentals.BasicSyntax.Exe;

import java.util.Scanner;

public class Vacation_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        if (type.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
        } else if (type.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            }
        } else if (type.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
        }
        double totalPrice = price * people;
        if (type.equals("Students") && people >= 30) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (type.equals("Business") && people >= 100) {
            totalPrice = (people - 10) * price;
        } else if (type.equals("Regular") && people >= 10 && people <= 20) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
