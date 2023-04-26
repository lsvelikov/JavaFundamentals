package Fundamentals.BasicSyntax.Exe;

import java.util.Scanner;

public class TriangleOfNumbers_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print(row + " ");
                if (row == column){
                    System.out.println();
                    break;
                }
            }
        }
    }
}
