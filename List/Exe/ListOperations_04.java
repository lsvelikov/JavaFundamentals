package Fundamentals.List.Exe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")){
            String command = input;

            if (command.contains("Add")){
                int number = Integer.parseInt(command.split("\\s+")[1]);
                numbersList.add(number);
            }else if (command.contains("Insert")){
                int number = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (index >= 0 && index <= numbersList.size() - 1){
                    numbersList.add(index, number);
                }else{
                    System.out.println("Invalid index");
                }
            }else if (command.contains("Remove")){
                int index = Integer.parseInt(command.split("\\s+")[1]);
                if (index >= 0 && index <= numbersList.size() - 1){
                    numbersList.remove(index);
                }else{
                    System.out.println("Invalid index");
                }
            }else if (command.contains("Shift")) {
                int count = Integer.parseInt(command.split("\\s+")[2]);
                if (command.contains("left")){
                    for (int i = 0; i < count; i++) {
                        int firstNumber = numbersList.get(0);
                        numbersList.add(firstNumber);
                        numbersList.remove(0);
                    }
                }else if (command.contains("right")){
                    for (int i = 0; i < count; i++) {
                        int lastNumber = numbersList.get(numbersList.size() - 1);
                        numbersList.add(0, lastNumber);
                        numbersList.remove(numbersList.size() - 1);
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
