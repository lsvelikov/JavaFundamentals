package Fundamentals.Arrays.Exe;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < i; leftIndex++) {
                leftSum += numbers[leftIndex];
            }
            for (int rightIndex = i + 1; rightIndex < numbers.length; rightIndex++) {
                rightSum += numbers[rightIndex];
            }
            if (leftSum == rightSum){
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("no");
        }
    }
}
