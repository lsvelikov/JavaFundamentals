package Fundamentals.List.Exe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String command = input;

            if (command.contains("Delete")){
                int number = Integer.parseInt(command.split(" ")[1]);
                numbersList.removeAll(Arrays.asList(number));
            }else if (command.contains("Insert")){
                int number = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbersList.add(position, number);
            }

            input = scanner.nextLine();
        }
        System.out.print(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
