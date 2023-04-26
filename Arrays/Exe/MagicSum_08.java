package Fundamentals.Arrays.Exe;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int nextNumber = array[j];

                if (currentNumber + nextNumber == magicNumber){
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}
