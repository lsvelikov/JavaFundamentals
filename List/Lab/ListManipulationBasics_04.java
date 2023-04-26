package Fundamentals.List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] commandArr = input.split("\\s+");
            String command = commandArr[0];

            switch (command){
                case "Add":
                    int numberToAdd = Integer.parseInt(commandArr[1]);
                    numbersList.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commandArr[1]);
                    numbersList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(commandArr[1]);
                    numbersList.remove(index);
                    break;
                case "Insert":
                    int number = Integer.parseInt(commandArr[1]);
                    int indexToInsert = Integer.parseInt(commandArr[2]);
                    numbersList.add(indexToInsert, number);
                    break;

            }
            input = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
