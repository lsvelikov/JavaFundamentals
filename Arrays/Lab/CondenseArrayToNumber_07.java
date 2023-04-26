package Fundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condensedArray = new int[numsArray.length - 1];

        for (int i = 0; i < numsArray.length; i++) {
            if (numsArray.length == 1){
                break;
            }
            if (i == numsArray.length - 1){
                int[] newCondensedArray = new int[condensedArray.length - 1];
                i =- 1;
                numsArray = condensedArray;
                condensedArray = newCondensedArray;
            }else{
                condensedArray[i] = numsArray[i] + numsArray[i + 1];
            }
        }
        System.out.println(numsArray[0]);
    }
}
