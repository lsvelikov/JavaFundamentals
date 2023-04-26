package Fundamentals.Arrays.Lab;

import java.util.Scanner;

public class SumEvenNumbers_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbersArray = new int[input.length];

        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(input[i]);
            if (numbersArray[i] % 2 == 0){
                sum += numbersArray[i];
            }
        }
        System.out.println(sum);
    }
}
