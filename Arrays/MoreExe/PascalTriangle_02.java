package Fundamentals.Arrays.MoreExe;

import java.util.Scanner;

public class PascalTriangle_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int[] secondArray = new int[number];

        for (int i = 1; i <= number; i++) {
            int[] firstArray = new int[number];

            for (int j = 0; j < i; j++) {
                if (j == 0 || j == number - 1){
                    firstArray[j] = 1;
                }else{
                    firstArray[j] = secondArray[j - 1] + secondArray[j];
                }
                System.out.print(firstArray[j] + " ");
            }
            secondArray = firstArray;
            System.out.println();
        }
    }
}
