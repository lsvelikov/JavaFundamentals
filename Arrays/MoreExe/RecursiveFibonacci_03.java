package Fundamentals.Arrays.MoreExe;

import java.util.Scanner;

public class RecursiveFibonacci_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int[] fibNumberArray = new int[number];

        for (int i = 0; i < number; i++) {
            int[] numbersArray = new int[number];
            if (i == 0 || i == 1){
                numbersArray[i] = 1;
            }else {
                numbersArray[i] = fibNumberArray[i - 2] + fibNumberArray[i - 1];
            }
            fibNumberArray[i] = numbersArray[i];
        }
        System.out.println(fibNumberArray[fibNumberArray.length - 1]);
    }
}
