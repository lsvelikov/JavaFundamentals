package Fundamentals.Arrays.Exe;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            int tempNumber = numbers[i];
            if (i == numbers.length - 1){
                System.out.print(tempNumber + " ");
                break;
            }
            boolean isTop = false;
            for (int j = i + 1; j < numbers.length; j++) {
                int nextTempNumber = numbers[j];

                if (tempNumber > nextTempNumber){
                    isTop = true;
                }else{
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(tempNumber + " ");
            }
        }
    }
}
