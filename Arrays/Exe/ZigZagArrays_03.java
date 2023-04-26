package Fundamentals.Arrays.Exe;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 1; i <= n; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (i % 2 != 0){
                firstArray[i - 1] = numbers[0];
                secondArray[i - 1] = numbers[1];
            }else{
                secondArray[i - 1] = numbers[0];
                firstArray[i - 1] = numbers[1];
            }
        }
        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArray){
            System.out.print(number + " ");
        }
    }
}
