package Fundamentals.List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandArr = input.split("\\s+");

            switch (commandArr[0]) {
                case "Contains":
                    int number = Integer.parseInt(commandArr[1]);
                    boolean isContaining = false;
                    for (int i = 0; i < numbersList.size(); i++) {
                        int currentNumber = numbersList.get(i);
                        if (number == currentNumber) {
                            isContaining = true;
                            break;
                        }
                    }
                    if (isContaining) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandArr[1].equals("even")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 == 0) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandArr[1].equals("odd")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 != 0) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    if (commandArr[1].equals("sum")) {
                        int sum = 0;
                        for (int i = 0; i < numbersList.size(); i++) {
                            sum += numbersList.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    String condition = commandArr[1];
                    int num = Integer.parseInt(commandArr[2]);
                    switch (condition) {
                        case "<":
                            for (int i = 0; i < numbersList.size(); i++) {
                                if (num > numbersList.get(i)) {
                                    System.out.print(numbersList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < numbersList.size(); i++) {
                                if (num < numbersList.get(i)) {
                                    System.out.print(numbersList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < numbersList.size(); i++) {
                                if (num <= numbersList.get(i)) {
                                    System.out.print(numbersList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < numbersList.size(); i++) {
                                if (num >= numbersList.get(i)) {
                                    System.out.print(numbersList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }


            input = scanner.nextLine();
        }
    }
}
