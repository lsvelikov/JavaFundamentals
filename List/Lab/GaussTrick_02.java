package Fundamentals.List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int currentList = numbersList.size() / 2;
        for (int i = 0; i < currentList; i++) {
            int firstNum = numbersList.get(i);
            int lastNum = numbersList.get(numbersList.size() - 1);
            int result = firstNum + lastNum;
            numbersList.set(i, result);
            numbersList.remove(numbersList.size() - 1);
        }
        for (int element : numbersList) {
            System.out.print(element + " ");
        }
    }
}
