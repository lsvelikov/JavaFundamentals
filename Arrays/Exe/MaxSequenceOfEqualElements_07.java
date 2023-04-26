package Fundamentals.Arrays.Exe;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int length = 1;
        int maxLength = 0;

        int startIndex = 0;
        int bestStart = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]){
                length++;
            }else{
                length = 1;
                startIndex = i + 1;
            }
            if (length > maxLength){
                maxLength = length;
                bestStart = startIndex;
            }
        }
        for (int i = bestStart; i < bestStart + maxLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
