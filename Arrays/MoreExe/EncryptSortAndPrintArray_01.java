package Fundamentals.Arrays.MoreExe;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int names = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[names];

        for (int i = 0; i < numbers.length; i++) {
            String name = scanner.nextLine();
            int length = name.length();

            int sum = 0;
            for (int j = 0; j < length; j++) {
                char symbol = name.charAt(j);

                if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U') {
                    sum += symbol * length;
                } else {
                    sum += symbol / length;
                }
            }
            numbers[i] = sum;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
            System.out.println(numbers[i]);
        }
    }
}
