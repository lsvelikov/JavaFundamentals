package Fundamentals.Methods.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(number));

    }
    public static int getMultipleOfEvensAndOdds(int num){
        int sumEven = evenSum(num);
        int sumOdd = oddSum(num);
        return sumEven * sumOdd;
    }
    public static int evenSum(int num) {

        String intToString = Integer.toString(num);

        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int oddSum(int num) {
        String intToString = Integer.toString(num);

        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
