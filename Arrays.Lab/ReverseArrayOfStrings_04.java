package Fundamentals.Arrays.Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArray.length / 2; i++) {
            String temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - 1 - i];
            inputArray[inputArray.length - 1 - i] = temp;

        }
        System.out.print(String.join(" ", inputArray));
    }
}
