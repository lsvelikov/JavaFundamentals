package Fundamentals.Arrays.Exe;

import java.util.Scanner;

public class Train_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wagon = Integer.parseInt(scanner.nextLine());
        int[] trainArray = new int[wagon];

        for (int i = 0; i < trainArray.length; i++) {
            int passenger = Integer.parseInt(scanner.nextLine());
            trainArray[i] = passenger;

        }
        int sum = 0;
        for (int number : trainArray) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
