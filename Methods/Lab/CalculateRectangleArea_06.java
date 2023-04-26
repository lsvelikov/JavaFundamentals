package Fundamentals.Methods.Lab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", calculateArea(width, height));
    }
    public static double calculateArea(double width, double height){
        return width * height;
    }
}
